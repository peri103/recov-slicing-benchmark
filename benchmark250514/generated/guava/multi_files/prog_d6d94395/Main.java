public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        student.enrollCourse(course1);
        student.enrollCourse(course2);

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course.getCourseName());
        }
    }
}