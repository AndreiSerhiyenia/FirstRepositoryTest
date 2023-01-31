package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class NestedIfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total purchases");
        int totalPurchases = scanner.nextInt();
        if (totalPurchases >= 15000) {
            System.out.println("Gift card number 1");
            if (totalPurchases >= 30000)
                System.out.println("Gift card number 2");

        } else {
            int lowPurchases = 15000 - totalPurchases;
            System.out.println("Sorry, gift card is " + lowPurchases + " $");
        }
    }
}
