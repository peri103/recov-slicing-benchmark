import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> dataList = new LinkedList<>();
        DataWriter writer = new DataWriter(dataList);
        DataReader reader = new DataReader(dataList);

        // Write data
        writer.writeData(42);

        // Create some students and add them to a course
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read data
        int value = reader.readData(0);
        System.out.println("Read value: " + value);
    }
}