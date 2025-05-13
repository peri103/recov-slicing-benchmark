import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureFormat();

        // Process CSV data
        CSVDataProcessor dataProcessor = new CSVDataProcessor(csvConfig);
        boolean isMapped = dataProcessor.isHeaderMapped("headerName");
        System.out.println("Is header mapped: " + isMapped);

        // Create a course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(new Student("Alice", 20));
        course.enrollStudent(new Student("Bob", 22));

        // Display enrolled students
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}