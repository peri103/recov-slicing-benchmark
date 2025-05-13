import com.google.common.collect.ListMultimap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course math = new Course("Math");
        student.enrollInCourse(math);

        student.addScore("Math", 95);

        ListMultimap<String, Integer> scores = student.getScoresForCourse("Math");
        /* read */ Integer score = scores.get("Alice").get(0);
        System.out.println("Alice's score in Math: " + score);

        // Additional operations
        Course science = new Course("Science");
        student.enrollInCourse(science);
        student.addScore("Science", 88);

        ListMultimap<String, Integer> scienceScores = student.getScoresForCourse("Science");
        Integer scienceScore = scienceScores.get("Alice").get(0);
        System.out.println("Alice's score in Science: " + scienceScore);
    }
}