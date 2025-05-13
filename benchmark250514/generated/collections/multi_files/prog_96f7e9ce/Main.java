public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.enrollInCourse("Math 101");
        student.enrollInCourse("Physics 101");

        CourseEnrollment enrollment = student.getEnrollment();
        String mathStatus = enrollment.getCourseStatus("Math 101");
        /* read */ String physicsStatus = enrollment.getCourseStatus("Physics 101");

        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        System.out.println("Math 101 Status: " + mathStatus);
        System.out.println("Physics 101 Status: " + physicsStatus);
    }
}