import org.apache.commons.collections4.list.NodeCachingLinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        ArrayList<String> arrayList = new ArrayList<>();
        
        /* write */ list.add("Hello, World!");

        for (int i = 0; i < 5; i++) {
            arrayList.add("Element " + i);
        }
        
        for (String element : arrayList) {
            list.add(element);
        }

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += i;
        }
        
        System.out.println("Sum of indices: " + sum);

        /* read */ String value = (String) list.get(0);
        System.out.println(value);

        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of first 5 numbers: " + product);
    }
}