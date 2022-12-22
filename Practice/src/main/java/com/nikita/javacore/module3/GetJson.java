package main.java.com.nikita.javacore.module3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetJson {
  public static void main(String[] args) throws FileNotFoundException {
//    String separator = File.separator;
    String path = "C:/COURSE 2022/Practice/src/main/java/com/nikita/javacore/module3/resources/skills.json";
    File file = new File(path);
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }
  }
}

