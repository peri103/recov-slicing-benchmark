public class Main {
    public static void main(String[] args) {
        // Create a course and enroll students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1001);
        Student student2 = new Student("Bob", 1002);
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Add scores for students
        student1.addScore(85);
        student2.addScore(90);

        // Handle CPIO entry
        CpioHandler handler = new CpioHandler("testEntry");
        handler.setEntryMode(0644);

        // Display student information
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
            System.out.println("Scores: " + student.getScores().getScores());
        }

        // Read mode from CPIO entry
        int mode = handler.getEntryMode();
        System.out.println("CPIO Entry Mode: " + mode);
    }
}