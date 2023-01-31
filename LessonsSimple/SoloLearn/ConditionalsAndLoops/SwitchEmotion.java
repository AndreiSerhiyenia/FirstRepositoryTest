package LessonsSimple.SoloLearn.ConditionalsAndLoops;
import java.util.Scanner;
public class SwitchEmotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your emotion:" + '\n' +
                "1 - You are happy!" + '\n' +
                "2 - You are sad!" + '\n' +
                "3 - You are angry!" + '\n' +
                "4 - You are surprised!");
        int emotion = scanner.nextInt();

     /*   switch (emotion) {
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:
                System.out.println("Unknown emotion.");
        }*/

        switch (emotion) {
            case 1 -> System.out.println("You are happy!");
            case 2 -> System.out.println("You are sad!");
            case 3 -> System.out.println("You are angry!");
            case 4 -> System.out.println("You are surprised!");
            case 5,6,7,8,9 -> System.out.println("Error");
            default -> System.out.println("Unknown emotion.");
        }
    }
}
