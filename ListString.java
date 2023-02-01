import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void zadanie1(String[] args){
        String [] tablica = {"aaa", "sss", "fff", "ddd"};
        List<String> list = new ArrayList<>();
        // list.addAll(list.of(tablica));

        for (String s: tablica){
            list.add(s);
        }
        for(String s: list)
            System.out.println(s);
    }
}
