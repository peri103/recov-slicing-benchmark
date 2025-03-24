import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value" + i);
        }
        
        // Using the write method
        student.storeData(1, "Hello");
        
        // More unrelated operations
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(i));
        }
        
        // Using the read method
        /* read */ String value = student.retrieveData(1);
        System.out.println(value);
        
        // Additional unrelated operations
        Student anotherStudent = new Student("Bob");
        anotherStudent.storeData(10, "World");
        System.out.println(anotherStudent.retrieveData(10));
    }
}