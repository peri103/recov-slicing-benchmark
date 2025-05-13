import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize map operations
        MapOperations mapOps = new MapOperations();
        mapOps.addValue("key", 42);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Get students and print their details
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read the value from map operations
        /* read */ int value = mapOps.getValue("key");
        System.out.println("Value from map: " + value);
    }
}