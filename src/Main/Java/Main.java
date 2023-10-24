package Main.Java;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Rules:");
        System.out.println("There are 9 boxes to pick from.If you match all three boxes,you win ");
        System.out.println("Your default shape is X");

        //ARRAY OF BOXES
        String[] userBox = new String[5];
        String[] cmpBox=new String[5];

        //random
        Random random = new Random();


        System.out.println("\n");
        System.out.println("Round 1:");

        System.out.println("Pick a box:");
        String userChoice=input.nextLine();
        userBox[0]=userChoice;

        System.out.println("COMPUTER TURN");
        int cmpChoice1 = random.nextInt(9) + 1;
        System.out.println("Computer choice is: " + cmpChoice1);

        cmpBox[1] = String.valueOf(cmpChoice1);


        String continueFlag = "";

        for (int i = 0; i < cmpBox.length; i++) {

            if (Objects.equals(cmpBox[i], String.valueOf(cmpChoice1))) {

                continueFlag = "false";
                break;
            }
            else{
                continueFlag="true";
            }

        }


        if(continueFlag.equals("true")){


            System.out.println("\n");
            System.out.println("Round 2:");


            System.out.println("Pick a box:");
            String userChoice2=input.nextLine();

            System.out.println("COMPUTER TURN");
            System.out.println("\t");
            System.out.println("Computer choice is:");

            System.out.println("\n");
            System.out.println("Round 3:");

            System.out.println("Pick a box:");
            String userChoice3=input.nextLine();

            System.out.println("COMPUTER TURN");
            System.out.println("\t");
            System.out.println("Computer choice is:");

            //add function to check

            //1. check for computer
            //2. check for user
        }
        else{
            System.out.println("Pick another valid box:");
            String userChoice2=input.nextLine();

            System.out.println("COMPUTER TURN");
            System.out.println("\t");
            System.out.println("Computer choice is:");

            System.out.println("\n");
            System.out.println("Round 3:");

            System.out.println("Pick a box:");
            String userChoice3=input.nextLine();

            System.out.println("COMPUTER TURN");
            System.out.println("\t");
            System.out.println("Computer choice is:");

            //add function to check

            //1. check for computer
            //2. check for user

        }




    }
}