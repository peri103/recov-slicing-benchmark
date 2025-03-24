import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("Alice", mathCourse);

        // Adding a score to the course
        student.addScore(95);

        // Retrieving the score from the course
        CopyOnWriteArrayList<Integer> scores = student.getCourse().getStudentScores();
        /* read */ int score = scores.get(0);

        // Printing the student's score
        System.out.println(student.getName() + "'s score in " + student.getCourse().getCourseName() + " is: " + score);

        // Adding more students and scores
        Student student2 = new Student("Bob", mathCourse);
        student2.addScore(85);

        Student student3 = new Student("Charlie", mathCourse);
        student3.addScore(90);

        // Printing all scores in the course
        System.out.println("All scores in " + mathCourse.getCourseName() + ":");
        for (Integer s : mathCourse.getStudentScores()) {
            System.out.println(s);
        }
    }
}