package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Random number guessing game, guess what number the computer is thinking of");

        int compNum = random.nextInt(21);
        System.out.println("Enter your guess here:");
        int userGuess = input.nextInt();
        while(userGuess=!compNum){
            System.out.println("Incorrect - please guess again");
            System.out.println("Enter your next guess:");
            int userGuess = input.nextInt();

        }
    }
}
