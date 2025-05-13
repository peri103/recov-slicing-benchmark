public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollInCourse("Math", 95);
        student.enrollInCourse("Science", 88);
        
        Integer mathGrade = student.getCourseGrade("Math");
        System.out.println("Math grade for " + student.getName() + ": " + mathGrade);
        
        Integer scienceGrade = student.getCourseGrade("Science");
        System.out.println("Science grade for " + student.getName() + ": " + scienceGrade);
    }
}