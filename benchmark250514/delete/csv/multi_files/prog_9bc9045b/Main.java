import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create students and courses
            Student student1 = new Student("John Doe", 20);
            Student student2 = new Student("Jane Smith", 22);
            Course course = new Course("Computer Science 101");

            // Enroll students in the course
            course.enrollStudent(student1);
            course.enrollStudent(student2);
            student1.enrollInCourse(course);
            student2.enrollInCourse(course);

            // Create CSV data and process it
            String csvData = "name;age;location\nJohn Doe;30;USA\nJane Smith;25;Canada";
            CSVProcessor csvProcessor = new CSVProcessor();
            List<String> recordStrings = csvProcessor.parseCSV(csvData);

            // Read the first record
            CSVRecord firstRecord = csvProcessor.getFirstRecord(csvData);
            /* read */ String recordString = firstRecord.toString();

            // Output the first record
            System.out.println("First record: " + recordString);

            // Output all records
            System.out.println("All records:");
            for (String recStr : recordStrings) {
                System.out.println(recStr);
            }

            // Output enrolled students
            System.out.println("Enrolled students in " + course.getCourseName() + ":");
            for (Student student : course.getEnrolledStudents()) {
                System.out.println(student.getName() + ", Age: " + student.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}