public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollInCourse("Mathematics");

        // Add grades for the student
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(95);

        // Finalize grades in the course
        student.getCourseName(); // Just to illustrate accessing courseName
        student.getCourseName().finalizeGrades();

        // Read a specific grade
        /* read */ int grade = student.getGrade(1);
        System.out.println("Grade at index 1: " + grade);
    }
}