public class Main {
    public static void main(String[] args) {
        // Initialize CSV utility and processor
        CSVUtil csvUtil = new CSVUtil();
        csvUtil.configureCSVFormat();

        // Prepare CSV data
        String csvData = "header1,header2\nvalue1,value2";

        // Process the CSV data
        CSVProcessor csvProcessor = new CSVProcessor(csvUtil);
        csvProcessor.processCSVData(csvData);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());
    }
}