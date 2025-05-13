import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV writer and reader
            CSVWriter csvWriter = new CSVWriter();
            CSVReader csvReader = new CSVReader();

            // Write a record
            csvWriter.writeRecord(Arrays.asList("one", "two", "three"));

            // Read the first record
            String result = csvReader.readFirstRecord(csvWriter.getWrittenData());
            System.out.println("CSV Record: " + result);

            // Additional functionality with Student and Course
            Student student = new Student("John Doe");
            Course course = new Course("Mathematics");

            student.enrollCourse(course.getCourseName());
            course.enrollStudent(student);

            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled Courses: " + student.getCourses());
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Enrolled Students: " + course.getEnrolledStudents().get(0).getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}