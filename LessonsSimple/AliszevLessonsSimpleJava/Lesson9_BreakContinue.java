package LessonsSimple.AliszevLessonsSimpleJava;

public class Lesson9_BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i<=15; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println("нечетное число "  + i);
        }
//        int i = 0;
//        while (true) {
//            if (i==15) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("End Loop");
    }
}
