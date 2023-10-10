

package com.codecool.mightytextadventure.ui;

import java.util.List;

public class Display {

  public void printMessage(String message) {
    System.out.println(message);
  }

  public void printAreaDescription(String description) { // from Area
    System.out.println("\nNARRATOR: " + description);
  }

  public void printWinMessage() {
    System.out.println("CONGRATULATIONS! YOU WIN!");
  }

  public void printLoseMessage() {
    System.out.println("GAME OVER! YOU LOST!");
  }

  public void printAvailableActions(List<String> actions) {
    System.out.println("\nAvailable actions:");
    int index = 1;
    for (String action : actions) {
      System.out.println(index + ". " + action);
      index++;
    }
  }

  public void printInvalidAction() {
    System.out.println("Invalid action! Try again.");
  }

  public void printSeparator() {
    System.out.println("------------------------------");
  }
}
