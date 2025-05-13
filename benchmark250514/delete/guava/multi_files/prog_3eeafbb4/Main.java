public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(95);
        student2.addScore(85);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            ImmutableList<Integer> scores = student.getScores().buildScores();
            /* read */ int score = scores.get(0);
            System.out.println("Score: " + score);
        }
    }
}