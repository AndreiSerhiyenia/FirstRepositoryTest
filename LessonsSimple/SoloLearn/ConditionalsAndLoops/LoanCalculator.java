package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take a loan");
        int loan = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            int month3 = (int) (loan *0.1);
            loan = loan - month3;
        }
        System.out.println(loan);
    }
}
