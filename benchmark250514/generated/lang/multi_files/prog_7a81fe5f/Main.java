public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course = new Course("Computer Science 101");
        course.addStudent(student1);
        course.addStudent(student2);

        student1.enroll();

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Enrolled: " + student.isEnrolled());
        }

        // Original read operation
        /* read */ boolean aliceEnrollmentStatus = student1.isEnrolled();
        System.out.println("Alice's enrollment status: " + aliceEnrollmentStatus);
    }
}