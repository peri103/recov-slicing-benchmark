import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addCourse("Math", "A");
        student.addCourse("Science", "B");

        Course mathCourse = new Course("Math");
        mathCourse.addStudentScore("John Doe", 95);
        mathCourse.addStudentScore("Jane Smith", 88);

        Course scienceCourse = new Course("Science");
        scienceCourse.addStudentScore("John Doe", 85);
        scienceCourse.addStudentScore("Jane Smith", 90);

        int totalMathScore = mathCourse.getTotalScore();
        System.out.println("Total Math Score: " + totalMathScore);

        int totalScienceScore = scienceCourse.getTotalScore();
        System.out.println("Total Science Score: " + totalScienceScore);

        // Retrieve grades for a specific course from the student
        /* read */ Collection<String> grades = student.getGrades("Math");

        // Print the grades retrieved from the student's record
        for (String grade : grades) {
            System.out.println("Grade in Math: " + grade);
        }
    }
}