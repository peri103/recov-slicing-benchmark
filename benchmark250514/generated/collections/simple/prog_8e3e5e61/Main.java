import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class Main {
    public static void main(String[] args) {
        // Initialize the NodeCachingLinkedList
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        
        // Write a value to the list
        /* write */ list.add("Hello, World!");
        
        // Read the value from the list
        /* read */ String value = (String) list.get(0);
        
        // Print the value to verify correctness
        System.out.println(value);
    }
}