package main.java.com.nikita.javacore;

import java.util.Scanner;

public class GameLogic {
  Field field = new Field();
  Scanner scanner = new Scanner(System.in);

  public void start() {
    boolean inProgress = true;

    while (inProgress) {
      field.printGame();
      System.out.println("Choose your field number");
      int position = scanner.nextInt();
      System.out.println("Choose your symbol");
      char symbol = scanner.next().charAt(0);
      while (symbol != 'X' && symbol != 'O'){
        System.out.println("Choose correct symbol");
        symbol = scanner.next().charAt(0);
      }
      move(position, symbol);
      inProgress = inProgress(symbol);
    }
  }

  public void move(int position, char symbol){
    field.setGameField(position - 1 , symbol);
  }

  boolean inProgress(char symbol) {
    if (field.gameField[0] == symbol && symbol == 'X' && field.gameField[1] == symbol  && field.gameField[2] == symbol) {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[3] == symbol && field.gameField[5] == symbol && field.gameField[6] == symbol&& symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[6] == symbol && field.gameField[7] == symbol && field.gameField[8] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[0] == symbol && field.gameField[3] == symbol && field.gameField[6] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[1] == symbol && field.gameField[4] == symbol && field.gameField[7] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[2] == symbol && field.gameField[5] == symbol && field.gameField[8] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[2] == symbol && field.gameField[4] == symbol && field.gameField[6] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[0] == symbol && field.gameField[4] == symbol && field.gameField[8] == symbol && symbol == 'X') {
      System.out.println("You win!!!");
      return false;

    } else  if (field.gameField[0] == symbol && symbol == 'O' && field.gameField[1] == symbol  && field.gameField[2] == symbol) {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[3] == symbol && field.gameField[5] == symbol && field.gameField[6] == symbol&& symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[6] == symbol && field.gameField[7] == symbol && field.gameField[8] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[0] == symbol && field.gameField[3] == symbol && field.gameField[6] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[1] == symbol && field.gameField[4] == symbol && field.gameField[7] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[2] == symbol && field.gameField[5] == symbol && field.gameField[8] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[2] == symbol && field.gameField[4] == symbol && field.gameField[6] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    } else if (field.gameField[0] == symbol && field.gameField[4] == symbol && field.gameField[8] == symbol && symbol == 'O') {
      System.out.println("You win!!!");
      return false;
    }
    else if(field.gameField[0] != '1' && field.gameField[1] != '2' && field.gameField[2] != '3' && field.gameField[3] != '4' && field.gameField[4] != '5' &&
    field.gameField[5] != '6' && field.gameField[6] != '7' && field.gameField[7] != '8' && field.gameField[8] != '9') {
      System.out.println("Draw");
      return false;
    }
    else
      return true;
  }
}
