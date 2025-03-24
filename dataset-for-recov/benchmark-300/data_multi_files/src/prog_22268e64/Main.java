import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        
        // Add some initial elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            student.addFirstToList(i * 10);
        }
        
        // Write to the LinkedList
        student.addFirstToList(100);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int num : student.getLinkedList()) {
            sum += num;
        }
        System.out.println("Sum of LinkedList elements: " + sum);
        
        // Read from the LinkedList
        /* read */ int value = student.getFirstFromList();
        System.out.println("Value read from LinkedList: " + value);
        
        // Add more elements to the LinkedList
        for (int i = 0; i < 3; i++) {
            student.addFirstToList(i * 20);
        }
        
        // Print all elements in the LinkedList
        System.out.println("All elements in LinkedList:");
        for (int num : student.getLinkedList()) {
            System.out.println(num);
        }
    }
}