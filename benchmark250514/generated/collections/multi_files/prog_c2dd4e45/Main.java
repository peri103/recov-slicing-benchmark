import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addScore(85);
        student2.addScore(90);
        
        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            List<Integer> scores = student.getScores();
            /* read */ int score = scores.get(0);
            System.out.println("Score: " + score);
        }
    }
}