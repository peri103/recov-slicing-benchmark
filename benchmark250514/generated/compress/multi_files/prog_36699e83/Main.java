import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using JarHandler to manage extra data
        JarHandler jarHandler = new JarHandler("example");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        jarHandler.setExtraData(extraData);

        // Create students and a course
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addGrade(85);
        student2.addGrade(90);

        Course course = new Course("Math");
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Retrieve and print the extra data from JarHandler
        /* read */ byte[] retrievedData = jarHandler.getExtraData();
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}