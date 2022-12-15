
// Dice jack game
/**
 * Rule: 
 * 1. User need to pick 3 numbers ex (4 3 5) numberSum = 12
 * 2. The user roll the dice 3 times ex (3 4 4) diceSum = 11. This is done by computer using Math.random 
 *      This means user is rolling dice 
 * 3. The user win if: 
 *      A. diceSum < numberSum that I choose
 *      B. (numberSum-diceSum) < 3 
 */

import java.util.Scanner;

public class DiceProject {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 number between 1 - 6");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Number cannot be less then 0! Shutting down the game..");
            System.exit(0);
        }
        if (n1 > 6 || n2 > 6 || n3 > 6) {
            System.out.println("Number cannot be greater then 6! Shutting down the game..");
            System.exit(0);
        }

        int sumOfNumber = n1 + n2 + n3;
        int diceSum = roll1 + roll2 + roll3;
        System.out.println("Sum of dice: " + diceSum + " & Number sum: " + sumOfNumber);

        if (checkWin(sumOfNumber, diceSum)) {
            System.out.println("Congrats! You win");
        } else {
            System.out.println("Sorry! You loose");
        }
        sc.close();

    }

    public static int rollDice() {
        double random = Math.random() * 6; // 0 - 0.999 so multiplying by 6 min 0 to max 5.99
        random += 1; // 1 - 6.999

        return (int) random; // 1 - 6
    }

    public static boolean checkWin(int numberSum, int diceSum) {
        return (numberSum > diceSum && numberSum - diceSum < 3);
    }
}