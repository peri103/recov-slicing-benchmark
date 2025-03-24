import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Add some elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        // Perform some operations on the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 20 == 0) {
                arrayList.set(i, arrayList.get(i) + 5);
            }
        }
        
        // Write to the LinkedList
        /* write */ list.addLast(1);
        
        // Perform some operations on the LinkedList
        for (int i = 0; i < 3; i++) {
            list.addLast(i * 5);
        }
        
        // Read from the LinkedList
        /* read */ int value = list.getLast();
        System.out.println("Last value in LinkedList: " + value);
        
        // Print the modified ArrayList
        System.out.println("Modified ArrayList:");
        for (int num : arrayList) {
            System.out.println(num);
        }
    }
}