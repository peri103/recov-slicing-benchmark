import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        try {
            DataProcessor processor = new DataProcessor();
            Course course = new Course("Advanced Programming");

            // Adding some students to the course
            course.addStudent(new Student("Alice", 20));
            course.addStudent(new Student("Bob", 21));
            course.addStudent(new Student("Charlie", 22));

            // Processing data
            processor.processData(100);

            // Displaying course information
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            // Reading processed data
            int processedData = processor.getProcessedData();
            System.out.println("Processed Data: " + processedData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}