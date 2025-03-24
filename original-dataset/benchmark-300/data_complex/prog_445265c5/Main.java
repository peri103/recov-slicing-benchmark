import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        /* write */ list.add(1);
        
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }
        
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        
        /* read */ int value = list.get(0);
        System.out.println("Initial value: " + value);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value at index " + i + ": " + list.get(i));
        }
        
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Hello");
        list3.add("World");
        
        for (String str : list3) {
            System.out.println(str);
        }
    }
}