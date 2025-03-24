import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        course.addStudent(student);

        /* write */ student.addScore("Math", 95);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        student2.addScore("Math", 85);
        course.addStudent(student2);

        Student student3 = new Student("Charlie");
        student3.addScore("Math", 90);
        course.addStudent(student3);

        // Retrieving the score for Alice
        /* read */ Integer aliceScore = student.getScores().get("Math");
        System.out.println("Alice's Math score: " + aliceScore);

        // Printing all students and their scores
        for (Student s : course.getStudents()) {
            System.out.println(s.getScores());
        }
    }
}