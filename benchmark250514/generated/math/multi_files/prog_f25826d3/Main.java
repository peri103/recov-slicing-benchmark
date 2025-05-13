import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 0);
        Student student2 = new Student("Bob", 1);

        // Create a course with grades
        Course course = new Course(2, 3);

        // Set grades for students
        course.setGrade(student1.getId(), 0, 85.0);
        course.setGrade(student2.getId(), 0, 90.0);
        
        // Perform unrelated operations
        course.setGrade(student1.getId(), 1, 75.0);
        course.setGrade(student2.getId(), 1, 80.0);
        
        // Fetch the grade matrix
        SparseRealMatrix gradeMatrix = course.getGradeMatrix();
        
        // Read a specific grade
        /* read */ double grade = gradeMatrix.getEntry(student1.getId(), 0);

        // Output the grade
        System.out.println("Grade for " + student1.getName() + " on assignment 0: " + grade);

        // Additional unrelated operations
        double average = (gradeMatrix.getEntry(student1.getId(), 0) + gradeMatrix.getEntry(student1.getId(), 1)) / 2;
        System.out.println("Average grade for " + student1.getName() + ": " + average);
    }
}