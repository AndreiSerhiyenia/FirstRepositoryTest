package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // if price car <= 12 000 print YES
        System.out.println("Enter price car.");
        int priceCar = scanner.nextInt();
        if (priceCar<=12000) {
            int moneyBeer = 12000 - priceCar;
            System.out.println("Yes, car is byu and money on the beer " + moneyBeer + " $.");
        } else {
            int money = priceCar - 12000;
            System.out.println("I am sorry, money is low - " + money + " $.");
        }
    }
}
