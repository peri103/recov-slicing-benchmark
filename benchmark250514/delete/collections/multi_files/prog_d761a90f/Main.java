public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.addScore("Math", 95);
        student.addScore("Science", 85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Retrieve scores
        int mathScore = student.getScore("Math");
        int scienceScore = student.getScore("Science");

        System.out.println("Math Score: " + mathScore);
        System.out.println("Science Score: " + scienceScore);

        // Performing unrelated operations
        int total = mathScore + scienceScore;
        System.out.println("Total Score: " + total);
    }
}