public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 20);
        student.addScore(85);

        // Print student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Retrieve and print the score
        Integer score = student.getScores().getScore();
        System.out.println("Student Score: " + score);
    }
}