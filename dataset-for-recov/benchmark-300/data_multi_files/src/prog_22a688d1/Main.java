import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        try {
            DataProcessor processor = new DataProcessor(10);
            processor.processData(42);

            Course course = new Course("Computer Science");
            course.addStudent(new Student("Alice", 20));
            course.addStudent(new Student("Bob", 22));

            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            int processedData = processor.getProcessedData();
            System.out.println("Processed Data: " + processedData);

            ArrayBlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(5);
            stringQueue.put("Hello");
            stringQueue.put("World");

            System.out.println("String from stringQueue: " + stringQueue.take());
            System.out.println("String from stringQueue: " + stringQueue.take());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}