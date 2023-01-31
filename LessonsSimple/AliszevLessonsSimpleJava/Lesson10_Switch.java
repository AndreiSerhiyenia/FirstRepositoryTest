package LessonsSimple.AliszevLessonsSimpleJava;

import java.util.Scanner;

public class Lesson10_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("you born");
                break;
            case 6:
                System.out.println("you go to school");
                break;
            case 18:
                System.out.println("end school");
                break;
            default:
                System.out.println("error");
        }
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = scaner.nextInt();
//        if (age==10) {
//            System.out.println("Study to scholl");
//        } else if (age==18) {
//            System.out.println("End scholl");
//        } else if (age == 60) {
//            System.out.println("End 60");
//        }else {
//            System.out.println("Error");

    }
}
