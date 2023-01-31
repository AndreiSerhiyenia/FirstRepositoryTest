package LessonsSimple.SoloLearn.ConditionalsAndLoops;

import java.util.Scanner;

public class LogicalOperatorsSmallCountryAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter population country");
        int population = sc.nextInt();
        System.out.println("Enter area country");
        int area = sc.nextInt();
        if (population < 10000 && area < 10000) {
            System.out.println("Small country");
        } else {
            System.out.println("Big country");
        }
    }
}
