import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVConfig and enable trim
        CSVConfig csvConfig = new CSVConfig();
        csvConfig.enableTrim();

        // Create CSVRecordHandler with the configured format
        CSVRecordHandler recordHandler = new CSVRecordHandler(csvConfig.getFormat());

        // Create a student and enroll courses
        Student student = new Student("Alice");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        student.enrollCourse(math);
        student.enrollCourse(science);

        // Display student's courses
        for (Course course : student.getCourses()) {
            System.out.println(student.getName() + " is enrolled in " + course.getCourseName());
        }

        // Check if a field is mapped in CSVRecord
        boolean isMapped = recordHandler.isFieldMapped("value");
        System.out.println("Is 'value' field mapped: " + isMapped);
    }
}