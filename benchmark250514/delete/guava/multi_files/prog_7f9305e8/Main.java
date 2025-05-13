import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.addScore(85);
        
        Course course = new Course("Mathematics");
        course.enrollStudent(student);

        for (Student s : course.getStudents()) {
            System.out.println(s.getName() + ", Age: " + s.getAge());
            LinkedListMultimap<String, Integer> scoresMap = s.getScores().getScoresMap();
            /* read */ Integer score = scoresMap.get("score").get(0);
            System.out.println("Score: " + score);
        }
    }
}