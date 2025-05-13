import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course math = new Course("Mathematics");
        math.addScore(student1.getId(), 85);
        math.addScore(student2.getId(), 90);

        Course science = new Course("Science");
        science.addScore(student1.getId(), 95);
        science.addScore(student2.getId(), 80);

        // Retrieve and print scores for Mathematics
        Set<Integer> scoresForAliceMath = math.getStudentScores().get(student1.getId());
        /* read */ for (Integer score : scoresForAliceMath) {
            System.out.println(student1.getName() + " scored " + score + " in " + math.getCourseName());
        }

        // Retrieve and print scores for Science
        Set<Integer> scoresForBobScience = science.getStudentScores().get(student2.getId());
        for (Integer score : scoresForBobScience) {
            System.out.println(student2.getName() + " scored " + score + " in " + science.getCourseName());
        }
    }
}