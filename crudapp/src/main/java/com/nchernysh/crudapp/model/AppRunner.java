package com.nchernysh.crudapp.model;

import com.nchernysh.crudapp.repository.SkillRepository;
import com.nchernysh.crudapp.repository.gson.GsonSkillRepositoryImpl;

import java.util.List;

public class AppRunner {
  public static void main(String[] args) {
    SkillRepository skillRepository = new GsonSkillRepositoryImpl();
    //List skills= skillRepository.getAll();???????
     List<Skill> skills= skillRepository.getAll();
     Skill newSkill = new Skill();
     newSkill.setId(2);
     newSkill.setName("B");
//skillRepository.save(newSkill);
    System.out.println(skillRepository.getAll());
    newSkill.setName("name");
   skillRepository.update(newSkill);
    System.out.println(newSkill);

  }
}
