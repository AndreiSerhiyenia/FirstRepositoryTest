package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class WhileLoopsFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to calculate the factorial");
        int number = scanner.nextInt();
        int number1 = number;
        int factorial = 1;
        while (number > 1) {
            factorial = factorial * number--;       //????????????
            //System.out.println(factorial);
        }
        System.out.println("The factorial of " + number1 + " will be " + factorial);
    }
}
