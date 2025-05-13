public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enroll("Computer Science", "CS101");
        student.addScore("Assignment1", 85);

        Integer score = student.getScore("Assignment1");
        System.out.println("Score for " + student.getName() + " in " + student.getScore("Assignment1") + ": " + score);
    }
}