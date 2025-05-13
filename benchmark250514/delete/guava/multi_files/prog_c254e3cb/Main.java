public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");

        // Adding scores for different courses
        student.addCourseScore("Math", 95);
        student.addCourseScore("Science", 90);

        // Fetching and displaying scores
        int mathScore = student.getCourseScore("Math");
        int scienceScore = student.getCourseScore("Science");

        System.out.println("Math Score: " + mathScore);
        System.out.println("Science Score: " + scienceScore);
    }
}