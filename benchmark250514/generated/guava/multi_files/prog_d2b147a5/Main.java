public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student student = new Student("John Doe", university);
        
        student.enrollInCourse("Math101");
        student.addScore("Math101", "Midterm", 85);
        
        Integer score = student.getScore("Math101", "Midterm");
        /* read */ System.out.println("John Doe's Midterm score in Math101: " + score);
    }
}