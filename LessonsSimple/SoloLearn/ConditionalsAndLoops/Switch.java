package LessonsSimple.SoloLearn.ConditionalsAndLoops;

public class Switch {
    public static void main(String[] args) {
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Th");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
