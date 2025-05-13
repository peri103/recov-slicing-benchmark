import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        course.addStudent(student1);
        course.addStudent(student2);

        // Add grades to students
        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(88);

        // Create a ComparisonUtil object and append values
        ComparisonUtil comparisonUtil = new ComparisonUtil();
        comparisonUtil.appendValues(5, 10);

        // Sort students based on their first grade
        Collections.sort(course.getStudents(), (s1, s2) -> {
            return s1.getGrades().get(0) - s2.getGrades().get(0);
        });

        // Get the comparison result
        int comparisonResult = comparisonUtil.getComparisonResult();
        System.out.println("Comparison Result: " + comparisonResult);

        // Print sorted students' names
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s first grade: " + student.getGrades().get(0));
        }
    }
}