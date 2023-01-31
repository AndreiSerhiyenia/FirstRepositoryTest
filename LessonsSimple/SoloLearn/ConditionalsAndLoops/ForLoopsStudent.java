package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class ForLoopsStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students who enter the university");
        int students = scanner.nextInt();
        for (int i = 0; i < students; i++) {
            System.out.println("Welcome to the university.");
        }
    }
}
