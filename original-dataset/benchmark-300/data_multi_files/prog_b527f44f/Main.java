import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        course.addStudent(student);
        student.addScore(95);

        for (Student s : course.getStudents()) {
            if (s.getName().equals("Alice")) {
                /* read */ boolean containsScore = s.getScores().contains(95);
                System.out.println("Alice's scores contain 95: " + containsScore);
            }
        }

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Students in course: " + course.getStudents().size());
    }
}