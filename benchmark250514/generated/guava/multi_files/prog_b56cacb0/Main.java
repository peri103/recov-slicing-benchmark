import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        Course math = new Course("Mathematics");

        student.addScore(85);
        student.addScore(92);
        
        List<Integer> scores = student.getScores();
        for (int score : scores) {
            String grade = math.getGrade(score);
            System.out.println(student.getName() + " scored " + score + " in " + math.getCourseName() + " and received grade: " + grade);
        }

        /* read */ int firstScore = scores.get(0);
        System.out.println("First score recorded for " + student.getName() + ": " + firstScore);
    }
}