import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        
        // Adding some initial data to list2 and list3
        list2.add(new ArrayList<>());
        list3.add(200);
        
        /* write */ list.add(1);
        
        // Performing some operations with list3
        int x = list3.get(0);
        System.out.println("Value from LinkedList: " + x);
        
        // Adding elements to list2 and list
        for (ArrayList<Integer> obj : list2) {
            obj.add(2);
            list.addAll(obj);
        }
        
        /* read */ int value = list.get(0);
        System.out.println("Value from ArrayList: " + value);
        
        // Creating and manipulating another ArrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 10);
        }
        
        // Adding elements from list4 to list
        for (int i = 0; i < list4.size(); i++) {
            list.add(list4.get(i));
        }
        
        // Printing elements from list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}