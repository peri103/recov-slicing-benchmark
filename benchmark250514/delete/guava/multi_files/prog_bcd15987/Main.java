import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("Bob", course);
        
        student.enrollCourse("Math 101", "Dr. Smith");
        
        // Perform some unrelated operations
        int[] grades = {90, 85, 92};
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        System.out.println("Total grades: " + total);
        
        String courseDetails = student.getCourseDetails();
        System.out.println("Course instructor: " + courseDetails);
    }
}