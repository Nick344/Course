package main.java.com.nikita.javacore.chapter03;

public class ScopeErr {
  public static void main(String[] args) {
    int bar = 1;
    {
//      int bar = 2; ERROR!!! bar is already exist in 5 line
    }
  }
}
