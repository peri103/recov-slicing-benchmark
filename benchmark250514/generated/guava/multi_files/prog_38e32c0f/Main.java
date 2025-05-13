public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        ReportGenerator reportGenerator = new ReportGenerator(dataManager);
        
        // Add some data
        dataManager.addData("key", 42);
        
        // Generate report
        reportGenerator.generateReport();
        
        // Create a course and enroll students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        // Print enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getStudentId());
        }
    }
}