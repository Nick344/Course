package com.nchernysh.crudapp.repository.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nchernysh.crudapp.model.Skill;
import com.nchernysh.crudapp.repository.SkillRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GsonSkillRepositoryImpl implements SkillRepository {

  private final Gson GSON = new Gson();
  private final String SKILL_FILE = "src/main/resources/skills.json";

  private List<Skill> getSkillsFromFile() {


    try {
      Path filePath = Path.of(SKILL_FILE);
      String json = "";
      byte[] bytes = Files.readAllBytes(Paths.get(String.valueOf(filePath)));
      json = new String(bytes);
      return GSON.fromJson(json, new TypeToken<List<Skill>>() {
      }.getType());
    } catch (IOException e) {
      return Collections.emptyList();
    }

//List<Video> videos = gson.fromJson(json, new TypeToken<List<Video>>(){}.getType());

  }

  private void writeSkillToFile(List<Skill> skills) {
    String json = GSON.toJson(skills);

    try (FileOutputStream fos = new FileOutputStream(SKILL_FILE)) {
      byte[] bytes = json.getBytes();
      fos.write(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  @Override
  public Skill getById(Integer id) {
    return getSkillsFromFile().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
  }

  @Override
  public List<Skill> getAll() {
    return getSkillsFromFile();
  }

  @Override
  public Skill save(Skill skill) {
    List<Skill> currentSkills = getSkillsFromFile();
    currentSkills.add(skill);
    writeSkillToFile(currentSkills);
    return skill;
  }

  @Override
  public Skill update(Skill skill) {
    List<Skill> currentSkills = getSkillsFromFile();
    List<Skill> updatedSkills  = getSkillsFromFile().stream().map(s -> {
  if (Objects.equals(skill.getId(), s.getId())) {
return skill;
  } else return s;
}).toList();
    writeSkillToFile(updatedSkills);
return skill;
  }

  @Override
  public void deleteById(Integer id) {
//    Optional.of(getById(id)).ifPresent((skill -> {
//      List<Skill> skills = getSkillsFromFile();
//      skills.remove(skill);
//      writeSkillToFile(skills);
//    }));
    List<Skill> filteredSkills = getSkillsFromFile().stream().filter(skill -> !skill.getId().equals(id)).toList();
    writeSkillToFile(filteredSkills);
  }
}
