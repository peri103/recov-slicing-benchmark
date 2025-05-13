import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("John");

        student.addGrade("Math", 85);
        student.addGrade("Science", 90);

        course.submitAssignment(student.getName(), "Assignment 1");

        HashMap<String, Integer> grades = student.getGrades();
        for (String subject : grades.keySet()) {
            System.out.println("Subject: " + subject + ", Grade: " + grades.get(subject));
        }

        String studentName = "John";
        MultiValueMap<String, String> assignments = course.getStudentAssignments();
        /* read */ String assignment = (String) assignments.get(studentName).iterator().next();
        System.out.println("Student: " + studentName + ", Assignment: " + assignment);
    }
}