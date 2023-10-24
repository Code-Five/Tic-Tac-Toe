package Main.Java;

import Main.Java.CheckWin;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("The Rules Are:");
        System.out.println("The game has 3 rounds");
        System.out.println("There are 9 boxes to pick from. If you match all three boxes, you win.");
        
        System.out.println("Your default shape is X");

        int rounds = 3; // Number of rounds

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round + ":");

            String[] userBox = new String[3];
            String[] cmpBox = new String[3];
            Random random = new Random();

            for (int move = 1; move <= 6; move++) {
                if (move % 2 == 1) {
                    // User's turn
                    displayBoard(userBox, cmpBox);
                    System.out.println("\n");
                    int userChoice;
                    do {
                        userChoice = getUserMove(input);
                    } while (userChoice < 1 || userChoice > 9 || isOccupied(userChoice, userBox, cmpBox));
                    userBox[(move - 1) / 2] = String.valueOf(userChoice);
                } else {
                    // Computer's turn
                    System.out.prinln("\n");
                    System.out.println("Computer's turn");
                    displayBoard(userBox, cmpBox);
                    int cmpChoice;
                    do {
                        cmpChoice = getComputerMove(random, userBox, cmpBox);
                    } while (isOccupied(cmpChoice, userBox, cmpBox));
                    cmpBox[(move - 2) / 2] = String.valueOf(cmpChoice);
                }

                if (move % 3 == 0) {
                    // Check for a win after three moves
                    boolean userWon = checkForWin(userBox);
                    boolean cmpWon = checkForWin(cmpBox);
                    if (userWon || cmpWon) {
                        if (userWon) {
                            System.out.println("You won this round!");
                        } else {
                            System.out.println("Computer won this round!");
                        }
                        break; // End the round
                    } else if (move == 6) {
                        System.out.println("It's a draw this round!");
                    }
                }
            }
        }
    }

    // Rest of your code remains the same
    private static void displayBoard(String[] userBox, String[] cmpBox) {
        for (int i = 1; i <= 9; i++) {
            String value = " ";
            if (isOccupied(i, userBox, cmpBox)) {
                value = isOccupied(i, userBox, null) ? "X" : "O";
            }
            System.out.print(" " + value + " ");
            if (i % 3 != 0) {
                System.out.print("||");
            } else {
                System.out.println();
                if (i != 9) {
                    System.out.println("===========");
                }
            }
        }
    }

    private static int getUserMove(Scanner input) {
        System.out.println("Pick a box Position from 1-9:");
        return input.nextInt();
    }

    private static int getComputerMove(Random random, String[] userBox, String[] cmpBox) {
        int cmpChoice;
        do {
            cmpChoice = random.nextInt(9) + 1;
        } while (isOccupied(cmpChoice, userBox, cmpBox));
        return cmpChoice;
    }

    private static boolean isOccupied(int choice, String[] userBox, String[] cmpBox) {
        if (userBox != null) {
            for (String box : userBox) {
                if (box != null && Integer.parseInt(box) == choice) {
                    return true;
                }
            }
        }
        if (cmpBox != null) {
            for (String box : cmpBox) {
                if (box != null && Integer.parseInt(box) == choice) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkForWin(String[] box) {
        // Implement your win-checking logic here
        CheckWin win = new CheckWin();
        return win.checkWin(box);
    }
}
