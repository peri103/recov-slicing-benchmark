public class Main {
    public static void main(String[] args) {
        Course course = new Course("Advanced Programming");
        
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        student1.addScore("Math", "Midterm", 85);
        student1.addScore("Science", "Final", 90);
        
        student2.addScore("Math", "Midterm", 78);
        student2.addScore("Science", "Final", 88);
        
        // Retrieve and print scores for student1
        StudentScores scores1 = student1.getScores();
        /* read */ Integer mathMidtermScore = scores1.getScore("Math", "Midterm");
        
        System.out.println("Student: " + student1.getName() + ", Age: " + student1.getAge());
        System.out.println("Math Midterm Score: " + mathMidtermScore);
        
        // Retrieve and print scores for student2
        StudentScores scores2 = student2.getScores();
        Integer scienceFinalScore = scores2.getScore("Science", "Final");
        
        System.out.println("Student: " + student2.getName() + ", Age: " + student2.getAge());
        System.out.println("Science Final Score: " + scienceFinalScore);
    }
}