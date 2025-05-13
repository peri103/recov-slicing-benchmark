public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics");

        student.enrollCourse(mathCourse);
        mathCourse.addStudentScore(student.getName(), "Assignment1", 95);
        
        // More operations
        mathCourse.addStudentScore(student.getName(), "Assignment2", 88);
        
        // Accessing the original write-read pair
        /* read */ Integer score = mathCourse.getStudentScore(student.getName(), "Assignment1");
        System.out.println("Score for Assignment1: " + score);
        
        // Further operations
        Integer score2 = mathCourse.getStudentScore(student.getName(), "Assignment2");
        System.out.println("Score for Assignment2: " + score2);
    }
}