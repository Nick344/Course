package main.java.com.nikita.javacore.module3.gson;

import main.java.com.nikita.javacore.module3.Skill;
import main.java.com.nikita.javacore.module3.inter.SkillRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class GsonSkillRepositoryImpl implements SkillRepository {
  public Skill getById(Integer id) {
    return null;
  }

  public List<Skill> getAll() throws FileNotFoundException {
    String separator = File.separator;
    String path = separator + "resources" + separator + "skills.json";
    File file = new File(path);
    Scanner scanner = new Scanner(file);

  }

//  public Skill save(Skill skill) {
//    return null;
//  }
//
//  public Skill udpate(Skill skill) {
//    return null;
//  }
//
//  void deleteById(Integer id) {
//
//  }
//
//  private List<Skill> getSkillsFromFile() {
//    return null;
//  }
//
//  private void writeSkillsToFile(List<Skill> skills) {
//
//  }
//}
  }
