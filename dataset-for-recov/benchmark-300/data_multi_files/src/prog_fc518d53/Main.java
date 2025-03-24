import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));

        try {
            // Sending a message
            messageQueue.sendMessage(100);

            // Processing students
            for (Student student : students) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            // Simulating some delay
            Thread.sleep(1000);

            // Receiving the message
            /* read */ int message = messageQueue.receiveMessage();
            System.out.println("Received message: " + message);

            // More unrelated code
            String info = "This is a multi-file complex program!";
            System.out.println(info);

            // Another loop for complexity
            for (int i = 0; i < 5; i++) {
                System.out.println("Loop iteration: " + i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}