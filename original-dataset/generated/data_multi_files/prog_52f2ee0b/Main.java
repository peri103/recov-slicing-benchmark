import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations();
        Student student = new Student("Alice", vectorOps);

        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        // Add scores to the student
        student.addScore(85);
        student.addScore(90);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());

        // Use the read method to retrieve the first score
        /* read */ int firstScore = student.getScore(0);
        System.out.println("First Score: " + firstScore);

        // Additional operations
        HashMap<String, Integer> courseCredits = new HashMap<>();
        courseCredits.put("Mathematics", 3);
        courseCredits.put("Science", 4);

        for (String course : student.getCourses()) {
            System.out.println("Course: " + course + ", Credits: " + courseCredits.get(course));
        }
    }
}