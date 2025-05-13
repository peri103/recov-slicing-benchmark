import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVHandler and parse CSV data
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "header1,header2\nvalue1,value2";
            CSVParser parser = csvHandler.parseCSV(csvData);

            // Use RecordReader to read comments from CSV
            RecordReader recordReader = new RecordReader(parser);
            String comment = recordReader.readComment();
            System.out.println("CSV Comment: " + comment);

            // Create a student and enroll in courses
            Student student = new Student("Alice");
            student.enrollInCourse("Math");
            student.enrollInCourse("Science");

            // Create a course and add student scores
            Course mathCourse = new Course("Math");
            mathCourse.addStudentScore(student.getName(), 95);

            // Print student courses and scores
            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled Courses: " + student.getCourses());
            System.out.println("Math Scores: " + mathCourse.getStudentScores());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}