import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a student and enroll them in courses
        Student student1 = new Student("John");
        Course math = new Course("Math");
        Course science = new Course("Science");
        
        student1.enrollCourse(math);
        student1.enrollCourse(science);
        
        // Add student IDs to courses
        math.addStudentId(101);
        science.addStudentId(101);

        // Retrieve student IDs from a course and check membership
        List<Course> courses = student1.getCourses();
        for (Course course : courses) {
            System.out.println(student1.getName() + " is enrolled in " + course.getCourseName());
            /* read */ boolean isEnrolled = course.getStudentIdsSet().contains(101);
            System.out.println("Is student 101 enrolled in " + course.getCourseName() + "? " + isEnrolled);
        }
    }
}