import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addScore(95);
        
        // Adding some unrelated operations
        LinkedList<String> courses = new LinkedList<>();
        courses.add("Math");
        courses.add("Science");
        courses.add("History");
        
        for (String course : courses) {
            System.out.println("Course: " + course);
        }
        
        /* read */ int score = student.getScores().getLast();
        System.out.println("Student's last score: " + score);
        
        // Adding more scores
        student.addScore(88);
        student.addScore(92);
        
        // Printing all scores
        for (int s : student.getScores()) {
            System.out.println("Score: " + s);
        }
    }
}