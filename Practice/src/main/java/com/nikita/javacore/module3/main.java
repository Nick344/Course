package main.java.com.nikita.javacore.module3;

import main.java.com.nikita.javacore.module3.gson.GsonSkillRepositoryImpl;
import main.java.com.nikita.javacore.module3.inter.SkillRepository;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    String string = new String("dsdsd");
    SkillRepository x = new GsonSkillRepositoryImpl();
    x.getAll();
  }
}
