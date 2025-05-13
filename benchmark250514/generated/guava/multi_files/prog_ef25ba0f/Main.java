import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student("Alice", course);
        Student student2 = new Student("Bob", course);

        student1.enrollInCourse("Math");
        student2.enrollInCourse("Science");

        // Build the ImmutableListMultimap from the course
        ImmutableListMultimap<String, String> courses = course.buildCourses();

        // Read operation: Get the students enrolled in Math
        /* read */ String studentName = courses.get("Math").get(0);

        // Print the student's name enrolled in Math
        System.out.println("Student enrolled in Math: " + studentName);

        // Additional operations to demonstrate complexity
        for (String courseName : courses.keySet()) {
            System.out.println("Course: " + courseName + ", Students: " + courses.get(courseName));
        }
    }
}