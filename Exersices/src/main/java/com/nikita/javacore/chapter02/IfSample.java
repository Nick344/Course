package main.java.com.nikita.javacore.chapter02;

public class IfSample {
  public static void main(String[] args) {
    int x, y;
    x=10;
    y=20;
    if (x < y) System.out.println("x меньше у");
    x = x * 2;
    if (x == y) System.out.println("x равно у");
    x = x * 2;
    if (x > y) System.out.println("x больше у");
    if (x == y) System.out.println("Вы не увидете этого");
  }
}
