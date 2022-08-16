package main.java.com.nikita.javacore.module2;


import java.util.*;

public class Task2 {
  public static void main(String[] args) {
    int[] array = {2, 4, 5, 6, 8};
    System.out.println("Array: " + Arrays.toString(array));
    boolean hasDuplicate = hasDuplicate(array);
    System.out.println("Result: " + hasDuplicate);

    if (!hasDuplicate) {
      System.out.println("Дубликатов нет");
    } else {
      countDuplicates(array);
    }
  }

  private static boolean hasDuplicate(int[] array) {
    Set<Integer> numbers = new HashSet<>();
    for (int number : array) {
      numbers.add(number);
    }
    if (array.length != numbers.size()) {
      return true;
    } else {
      return false;
    }
  }

  private static void countDuplicates(int[] array) {
    Map<Integer, Integer> duplicatesMap = new HashMap<>();
    for (int number : array) {
      Integer duplicatesCount = duplicatesMap.get(number);
      if (duplicatesCount == null) {
        duplicatesMap.put(number, 1);
      } else {
        duplicatesMap.put(number, duplicatesCount + 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : duplicatesMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println("Число " + entry.getKey() + " повторяется " + entry.getValue() + " раза");
      }
    }
  }
}


//  private static void hasDuplicate() {
//    int[] array = {4, 5, 6, 6,7,7,7,8,8};
//    for (int i = 0; i < array.length; i++) {
//      for (int j = i + 1; j < array.length; j++) {
//        if (array[i] == array[j]) {
//          System.out.println("We have a duplicate it's number " + array[i] + ", ");
//          countOfDuplicate(array[i],array );
//        }
//      }
//    }
//    System.out.println("Don't have any duplicate");
//  }
//
//  private static void countOfDuplicate(int number, int[] array) {
//    int count = 0;
//    for (int i = 0; i < array.length; i++) {
//      if (number == array[i]) {
//        count++;
//      }
//    }
//    System.out.println(count + " times");
//  }
//}


//  public static void main(String[] args) {
//    Integer[] array = {4, 5, 6, 6,8};
//    hasDuplicate(array);
//  }
//
//  private static void hasDuplicate(Integer[] array) {
//    Set<Integer> duplicatesSet = new HashSet<>(Arrays.asList(array));
//    if (duplicatesSet.size() == array.length) {
//      System.out.println("Duplicates not found");
//      return;
//    } else {
//      System.out.println("Duplicates has been found");
//    }
//
//    Map<Integer, Integer> numberCountMap = new HashMap<>();
//    for (int i : array) {
//      Integer duplicatesCount = numberCountMap.get(i);
//      if (duplicatesCount == null) {
//        numberCountMap.put(i, 1);
//      } else {
//        numberCountMap.put(i, duplicatesCount + 1);
//      }
//    }
//
//    for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
//      if (entry.getValue() > 1) {
//        System.out.println("Number " + entry.getKey() + " has been repeated " + entry.getValue() + " times");
//      }
//    }
//  }
//}
