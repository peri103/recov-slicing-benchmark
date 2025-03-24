public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Computer Science");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Add data to the student's data manager
        student.addData("example");

        // Check if the data exists in the student's data manager
        boolean contains = student.checkData("example");
        System.out.println("Student contains 'example': " + contains);

        // Print enrolled students in the course
        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Enrolled student: " + enrolledStudent);
        }
    }
}