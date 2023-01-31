package LessonsSimple.AliszevLessonsSimpleJava;

import java.util.Scanner;

public class Lesson8_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter 5");
            value = sc.nextInt();
        } while (value != 5);
        System.out.println("You enter 5");
    }

        public static void main2() {
            int value2;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter 6");
            value2 = sc2.nextInt();
            while (value2 != 6) {
                System.out.println("Enter 6");
                value2 = sc2.nextInt();
            }
        }
}
