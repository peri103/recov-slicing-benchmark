import org.apache.commons.collections4.list.NodeCachingLinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        ArrayList<Integer> auxiliaryList = new ArrayList<>();

        // Insert some values into the auxiliary list
        for (int i = 0; i < 5; i++) {
            auxiliaryList.add(i * 10);
        }

        // Add elements from auxiliaryList to NodeCachingLinkedList
        for (int val : auxiliaryList) {
            list.add(val);
        }

        /* write */ list.add(42);

        // Perform some operations on auxiliaryList
        int sum = 0;
        for (int num : auxiliaryList) {
            sum += num;
        }
        System.out.println("Sum of auxiliaryList: " + sum);

        // Use another list to store some values
        NodeCachingLinkedList anotherList = new NodeCachingLinkedList();
        anotherList.add(100);
        anotherList.add(200);

        // Retrieve and print values from anotherList
        for (int i = 0; i < anotherList.size(); i++) {
            System.out.println("Value from anotherList: " + anotherList.get(i));
        }

        // Retrieve the value added to the original list
        /* read */ int value = (Integer) list.get(5);
        System.out.println("Retrieved value from NodeCachingLinkedList: " + value);

        // Further operations on the original list
        list.add(84);
        list.add(126);

        // Print all values from the original list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value from list: " + list.get(i));
        }
    }
}