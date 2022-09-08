package dicegame;

import java.util.*;

class Gamedice {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int one = 0;
        int two = 0;
        String choice;
        Random random = new Random();
        do {
            System.out.print("Select Player 1 or 2 : ");
            int player = kb.nextInt();

            int dice = random.nextInt(5) + 1;
            System.out.println("Player Dice Value:" + dice);
            if (player == 1) {
                one = one + dice;
            } else if (player == 2) {
                two = two + dice;
            } else {
                System.out.println("Oops! Invalid Player entered!");
            }
            System.out.println("Do you want to continue playing? (Enter y for yes and n for no.)");
            kb.nextLine();
            choice = kb.nextLine();
        } while (choice.equalsIgnoreCase("y"));
           kb.close();
        System.out.println("Game Finished!");
        System.out.println("Player 1 Score: " + one);
        System.out.println("Player 2 Score: " + two);

        if (one > two) {
            System.out.println("Player 1 won the game!");
        }

        else if (one < two) {
            System.out.println("Player 2 won the game!");
        }

        else {
            System.out.println("Game Draw!");
        }

    }
}
