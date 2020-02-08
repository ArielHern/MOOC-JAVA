
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!     
        int guessedNum = 0;
        int counter = 0;

        while (guessedNum != numberDrawn) {
            System.out.println("Guess a number: ");
            guessedNum = Integer.parseInt(reader.nextLine());
            counter++;

            if (guessedNum == numberDrawn) {
                break;
            }
            if (guessedNum > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + counter);
            }
            if (guessedNum < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + counter);
            }

        }

        System.out.println("Congratulations, your guess is correct!");

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
