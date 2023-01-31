package LessonsSimple.SoloLearn.BasicConcepts;

import java.util.Scanner;

public class TimeConverterDaysToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers day covert to seconds");
        int days = scanner.nextInt();
        int seconds = days * 24 * 60 * 60;
        System.out.println(days + " days" + " = " + seconds + " seconds.");
    }
}
