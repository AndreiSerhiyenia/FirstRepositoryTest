package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class DoWhileBankSecuritySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Write password");
            password = scanner.nextInt();
        }
        while (password != 1301);
    }
}
