package LessonsSimple.SoloLearn.BasicConcepts;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Your number is " + number + ".");
    }
}
