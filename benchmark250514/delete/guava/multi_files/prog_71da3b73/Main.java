public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Create a course and add student scores
        Course course = new Course("Mathematics");
        course.addStudentScore(student1.getName(), 95);
        course.addStudentScore(student2.getName(), 88);

        // Retrieve and display student scores
        ImmutableBiMap<String, Integer> scores = course.getStudentScores();
        /* read */ Integer aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Display all scores
        for (String studentName : scores.keySet()) {
            System.out.println(studentName + "'s score: " + scores.get(studentName));
        }
    }
}