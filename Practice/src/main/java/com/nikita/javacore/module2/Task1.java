package main.java.com.nikita.javacore.module2;


public class Task1 {
  public static void main(String[] args) {
    int number = 23;
    returnIndex(number);
  }

  private static void returnIndex(int number) {
    int[] array = {3, 8, 15, 17};
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[i] + array[j] == number) {
          System.out.println(i + " " + j);
        }
      }
    }
  }
}


