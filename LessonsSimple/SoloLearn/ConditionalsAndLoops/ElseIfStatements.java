package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class ElseIfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age<=0){
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Too Young");
        } else if (age < 100) {
            System.out.println("Welcome");
        }else {
            System.out.println("Really?");
        }
    }
}
