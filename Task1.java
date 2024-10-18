package CodeSoft;

import java.util.Scanner;

// NUmber Game
public class Task1 {
    static int userScore = 0;
    public static void playGame(int guessLimit , int rounds) {
        Scanner sc = new Scanner(System.in);
        double randNum = Math.random() * 100;
        int ranNum = (int) randNum;

        System.out.print("Enter game-number : ");
        

        for (int i = 1; i <= guessLimit; i++) {
            int userInput = sc.nextInt();
            
            if (userInput == ranNum) {
                userScore++;
                System.out.println("Correct ,The game number is : " + userInput + "     user-score : "+userScore + "/" + rounds) ;
                return;
            } else if (userInput > ranNum * 2) {
                if (i < guessLimit) {
                    System.out.print("TOO HIGH \nEnter number again : ");
                }
            } else if (userInput < ranNum / 2) {
                if (i < guessLimit) {
                    System.out.print("TOO LOW \nEnter number again : ");
                }

            } else if (userInput > ranNum) {
                if (i < guessLimit) {
                    System.out.print("HIGH \nEnter number again : ");
                }

            } else if (userInput < ranNum) {
                if (i < guessLimit) {
                    System.out.print("LOW \nEnter number again : ");
                }

            }
        }
        System.out.println("You fail to guess!! " + "\nThe game-number is : " + ranNum + "     Score : "+userScore + "/" + rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rounds wanna play : ");
        int rounds = sc.nextInt();
        int guessLimit = 8;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nSTART ROUND : " + i);
            playGame(guessLimit , rounds);
        }
        
    }
}
