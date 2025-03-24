import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();
        
        /* write */ list.addFirst(1);
        
        list3.addFirst("Hello");
        list3.addLast("World");
        
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }
        
        for (String str : list3) {
            System.out.println(str);
        }
        
        /* read */ int value = list.getFirst();
        System.out.println("Value from LinkedList: " + value);
        
        for (int num : list2) {
            System.out.println("Value from ArrayList: " + num);
        }
        
        list.addLast(2);
        list.addLast(3);
        
        for (int num : list) {
            System.out.println("Updated LinkedList: " + num);
        }
    }
}