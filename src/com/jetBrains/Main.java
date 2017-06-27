package com.jetBrains;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        int inputNumber = 0;
        String Loop = "y";
        String userName;

        System.out.println("What is your name?");
        userName = scnr.next();

        //run code in braces while loop equals "y"
        while (Loop.equals("y") ) {
            System.out.println(userName + ", enter a number between 1 and 100");
            inputNumber = scnr.nextInt();

            if (inputNumber >= 1 && inputNumber <= 100) {
                if (inputNumber % 2 != 0) {
                    System.out.println(inputNumber + ", Odd");
                }
                else if ((inputNumber % 2 == 0) && (inputNumber >= 2 && inputNumber <= 25)) {
                    System.out.println("Even and less than 25");
                }
                else if ((inputNumber % 2 == 0) && (inputNumber >= 26 && inputNumber <= 60)) {
                    System.out.println("Even");
                }
                else if ((inputNumber % 2 == 0) && (inputNumber > 60)) {
                    System.out.println(inputNumber + ", Even");
                }
                else if ((inputNumber % 2 != 0) && (inputNumber > 60)) {
                    System.out.println(inputNumber + ", Odd and over 60");
                }

                //while loop runs again if user presses y, stops if user presses n and tells user to type y or n if they typed something different
                System.out.print("Continue? (y/n): ");
                Loop = scnr.next();

                if (Loop.equals("y")) {
                    continue;
                } else if (Loop.equals("n")) {
                    System.out.println("Bye!");
                    break;
                }
                while (!Loop.equals("y") && !Loop.equals("n")) {
                    System.out.println("Type y or n!");
                    Loop = scnr.next();
                };
            }
            //while loops runs if the integer entered is lower than 1 or higher than 100
            while (!(inputNumber >= 1 && inputNumber < 100)) {
                System.out.println("Integers between 1 and 100 only");
                break;
            }
        }
    }
}
