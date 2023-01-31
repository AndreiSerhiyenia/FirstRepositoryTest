package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class LogicalOperatorsAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your money");
        int money = sc.nextInt();
        /* if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome to casino");
            }
        } //break;*/

        if (age > 18 && money > 500) {
            System.out.println("Welcome to casino");
            //break;
        }
        if (age < 18) {
            System.out.println("You need 18 years old.");
        } else {
            System.out.println("Your age is OK.");
        }
        if (money < 500) {
            System.out.println("You need have 500 dollars cash.");
        } else {
            System.out.println("Your cash is OK");
        }
    }
}
