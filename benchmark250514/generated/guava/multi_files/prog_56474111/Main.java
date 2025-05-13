public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.displayInfo();
        
        student.enrollCourse("Math", 85);
        student.enrollCourse("Science", 90);
        
        int mathScore = student.getCourseScore("Math");
        System.out.println("Math Score: " + mathScore);
        
        int scienceScore = student.getCourseScore("Science");
        System.out.println("Science Score: " + scienceScore);
    }
}