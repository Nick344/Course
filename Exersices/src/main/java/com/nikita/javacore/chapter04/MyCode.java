package main.java.com.nikita.javacore.chapter04;

public class MyCode {
  public static void main(String[] args) {
    int a = 100;
    int count = 0;

    for (int i = 0; i < 100; i++) {
      a = a << 1;
      System.out.println(a);
      count++;
      if (a < 0) break;
    }
    System.out.println("count: " + count);
  }
}
