import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create courses
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);

        // Enroll students in courses
        alice.enrollCourse(math);
        alice.enrollCourse(science);
        bob.enrollCourse(math);

        // Manage student scores
        StudentScores studentScores = new StudentScores();
        studentScores.addScore(alice.getName(), math.getCourseName(), 95);
        studentScores.addScore(alice.getName(), science.getCourseName(), 88);
        studentScores.addScore(bob.getName(), math.getCourseName(), 78);

        // Retrieve and print scores for Alice
        List<Course> aliceCourses = alice.getCourses();
        for (Course course : aliceCourses) {
            /* read */ Integer score = studentScores.getScore(alice.getName(), course.getCourseName());
            System.out.println(alice.getName() + " scored " + score + " in " + course.getCourseName());
        }

        // Additional operations
        for (Course course : aliceCourses) {
            System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }
    }
}