import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize ReferenceMapOperations
        ReferenceMapOperations mapOps = new ReferenceMapOperations();
        
        // Write operation
        mapOps.addEntry("key", 42);

        // Create a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add grades to students
        student1.addGrade(85);
        student2.addGrade(90);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Read operation
        /* read */ Integer value = mapOps.getEntry("key");
        System.out.println("Value for 'key': " + value);
    }
}