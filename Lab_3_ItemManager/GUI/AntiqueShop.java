package GUI;

import DTO.*;
import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // We keep one variable for each type so we know exactly what was created
        Vase myVase = null;
        Statue myStatue = null;
        Painting myPainting = null;

        // This string remembers which item was created last
        String lastCreated = "none";

        int choice = 0;
        do {
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a Statue");
            System.out.println("3. Create a Painting");
            System.out.println("4. Display the Item");
            System.out.println("0. Exit");
            System.out.print("Input a choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                myVase = new Vase();
                myVase.inputVase();
                lastCreated = "vase";

            } else if (choice == 2) {
                myStatue = new Statue();
                myStatue.inputStatue();
                lastCreated = "statue";

            } else if (choice == 3) {
                myPainting = new Painting();
                myPainting.inputPainting();
                lastCreated = "painting";

            } else if (choice == 4) {
                // Check which item was created last and display it
                if (lastCreated.equals("vase")) {
                    myVase.outputVase();
                } else if (lastCreated.equals("statue")) {
                    myStatue.outputStatue();
                } else if (lastCreated.equals("painting")) {
                    myPainting.outputPainting();
                } else {
                    System.out.println("You need to create an object first");
                }

            } else if (choice != 0) {
                System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 0);
    }
}
