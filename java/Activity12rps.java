package com.example;

import java.util.Random;
import java.util.Scanner;

public class Activity12rps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        System.out.println(" Welcome to Rock-Paper-Scissors!");

        while (playAgain) {

            try {
                
                System.out.print("\nEnter rock, paper, or scissors: ");
                String playerChoice = sc.next().toLowerCase();

                
                boolean validInput = false;
                for (String choice : choices) {
                    if (choice.equals(playerChoice)) {
                        validInput = true;
                        break;
                    }
                }

                if (!validInput) {
                    throw new IllegalArgumentException(
                            "Invalid input! Please enter rock, paper, or scissors."
                    );
                }

                
                String computerChoice = choices[random.nextInt(3)];
                System.out.println("Computer chose: " + computerChoice);

               
                if (playerChoice.equals(computerChoice)) {
                    System.out.println("Result: It's a Draw!");
                } else if (
                        (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock"))
                ) {
                    System.out.println("Result: You Win! 🎉");
                } else {
                    System.out.println("Result: Computer Wins! ");
                }

            } catch (IllegalArgumentException e) {
                
                System.out.println(e.getMessage());
                continue; 
            } catch (Exception e) {
                
                System.out.println("Something went wrong. Please try again.");
                continue;
            }

           
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing! ");
        sc.close();
    }
}
