import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        // Writing to the HashSet via Student
        student.addValueToSet("example");

        // Reading from the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the HashSet via Student
        /* read */ boolean containsValue = student.checkValueInSet("example");
        System.out.println("HashSet contains 'example': " + containsValue);

        // Adding more elements to the HashSet via Student
        student.addValueToSet("anotherExample");
        student.addValueToSet("yetAnotherExample");

        // Printing all elements in the HashSet via Student
        System.out.println("HashSet contains 'anotherExample': " + student.checkValueInSet("anotherExample"));
        System.out.println("HashSet contains 'yetAnotherExample': " + student.checkValueInSet("yetAnotherExample"));
    }
}