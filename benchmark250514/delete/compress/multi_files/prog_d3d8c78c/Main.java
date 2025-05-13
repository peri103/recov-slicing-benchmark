import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a GzipParametersWrapper instance and set modification time
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        Date modificationTime = new Date();
        gzipWrapper.setModificationTime(modificationTime);

        // Create students and a course
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Advanced Java Programming");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve and print the modification time
        /* read */ Date retrievedModificationTime = gzipWrapper.getModificationTime();
        System.out.println("Modification Time: " + retrievedModificationTime);

        // Additional unrelated code
        ArrayList<Double> calculations = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            calculations.add(Math.pow(i, 2));
        }

        for (Double calc : calculations) {
            System.out.println("Calculation result: " + calc);
        }
    }
}