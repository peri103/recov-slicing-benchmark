import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        course.addStudent(student);

        // Adding data to the student's dataset
        student.addData("Hello");

        // Retrieving and checking the data
        HashSet<String> dataSet = student.getDataSet();
        /* read */ boolean containsHello = dataSet.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        // Additional operations
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addData("World");

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getDataSet());
        }
    }
}