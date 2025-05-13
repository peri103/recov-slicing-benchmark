public class Main {
    public static void main(String[] args) {
        // Demonstrate CSV format and record handling
        CSVFormatHandler formatHandler = new CSVFormatHandler();
        CSVRecordHandler recordHandler = new CSVRecordHandler(formatHandler);

        boolean isHeader1Mapped = recordHandler.isHeaderMapped("Header1");
        System.out.println("Is 'Header1' mapped: " + isHeader1Mapped);

        // Demonstrate student-course relationship
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        student.enrollInCourse(course);
        course.addStudent(student);

        System.out.println("Student " + student.getCourses().get(0).getTitle() + " enrolled in course.");
        System.out.println("Course " + course.getTitle() + " has student: " + course.getStudents().get(0).getName());
    }
}