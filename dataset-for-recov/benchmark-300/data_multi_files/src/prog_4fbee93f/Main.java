public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Computer Science");

        course.enrollStudent(student);
        student.addData("CS101");

        /* read */ boolean isEnrolled = student.checkData("CS101");
        System.out.println("Is Alice enrolled in CS101? " + isEnrolled);

        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Student: " + enrolledStudent.getName() + " is enrolled in " + course.getCourseName());
        }
    }
}