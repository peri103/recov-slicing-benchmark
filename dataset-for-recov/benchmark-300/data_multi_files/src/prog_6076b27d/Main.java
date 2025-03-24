import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        List<Student> students = new ArrayList<>();
        
        try {
            /* write */ queueManager.writeValue(42);
            
            // Adding unrelated code to make the program more complex
            students.add(new Student("Alice", 20));
            students.add(new Student("Bob", 22));
            
            for (Student student : students) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }
            
            /* read */ int value = queueManager.readValue();
            System.out.println("Value from queue: " + value);
            
            // More unrelated code
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            for (String str : stringList) {
                System.out.println(str);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}