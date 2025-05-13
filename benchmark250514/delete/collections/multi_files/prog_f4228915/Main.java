import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course();
        Student student = new Student("Alice", mathCourse);

        student.addScore(85);
        student.addScore(90);

        // Some unrelated operations
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += i;
        }
        System.out.println("Total of numbers from 0 to 4 is: " + total);

        Collection<Integer> scores = student.getScores();
        /* read */ for (Integer score : scores) {
            System.out.println("Score: " + score);
        }
    }
}