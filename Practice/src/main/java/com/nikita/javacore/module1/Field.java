package main.java.com.nikita.javacore.module1;

public class Field {
  char gameField [] = {'1','2','3','4','5','6','7','8','9'};

  public void printGame() {
    System.out.println(gameField[0] + " | " + gameField[1] + " | " + gameField[2]);
    System.out.println("__________");
    System.out.println(gameField[3] + " | " + gameField[4] + " | " + gameField[5]);
    System.out.println("__________");
    System.out.println(gameField[6] + " | " + gameField[7] + " | " + gameField[8]);
  }

  public char[] getGameField() {
    return gameField;
  }

  public void setGameField(int position, char symbol) {
    gameField[position] = symbol;
  }
}
