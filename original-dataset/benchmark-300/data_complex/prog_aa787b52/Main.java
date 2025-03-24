import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        
        // Adding some unrelated operations
        list3.add(200);
        for (int i = 0; i < 5; i++) {
            list3.add(i * 10);
        }
        
        /* write */ list.add(42);
        
        // Adding more unrelated operations
        list2.add(list);
        for (int i = 0; i < list3.size(); i++) {
            list.add(list3.get(i));
        }
        
        /* read */ int value = list.get(0);
        System.out.println(value);
        
        // Adding more complex operations
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 20);
        }
        for (int i = 0; i < list4.size(); i++) {
            list.add(list4.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}