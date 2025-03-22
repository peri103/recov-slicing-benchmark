public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics");
        
        student.addCourse(mathCourse);
        student.addScore(95);
        
        mathCourse.addStudentGrade("Alice", 95);
        
        StudentScores scores = student.getScores();
        /* read */ int score = scores.getScores().get(0);
        System.out.println("Score for Alice: " + score);
        
        Integer mathGrade = mathCourse.getStudentGrade("Alice");
        System.out.println("Math grade for Alice: " + mathGrade);
    }
}