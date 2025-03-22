public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Math");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add scores to students
        student1.addScore(85);
        student1.addScore(90);
        student2.addScore(75);
        student2.addScore(80);

        // Add students to course
        course.addStudent(student1);
        course.addStudent(student2);

        // Retrieve scores and print them
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getScores());
            /* read */ int lastScore = student.getScores().getLast();
            System.out.println("Last score: " + lastScore);
        }
    }
}