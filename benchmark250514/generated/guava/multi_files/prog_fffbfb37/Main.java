public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.enrollStudent(student1.getName());
        course.enrollStudent(student2.getName());
        course.enrollStudent(student1.getName());

        student1.completeCourse("Math");
        student2.completeCourse("Science");

        System.out.println("Student: " + student1.getName() + ", Completed Courses: " + student1.getCompletedCourses());
        System.out.println("Student: " + student2.getName() + ", Completed Courses: " + student2.getCompletedCourses());

        /* read */ int count = course.getEnrollmentCount("Alice");
        System.out.println("Enrollment count for Alice: " + count);

        for (String studentName : course.getAllEnrollments().elementSet()) {
            System.out.println("Student: " + studentName + ", Enrollments: " + course.getEnrollmentCount(studentName));
        }
    }
}