import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course course = student.getCourse();
        
        // Adding grades for the student
        course.addGrade(95);
        course.addGrade(85);
        course.addGrade(75);

        // Performing some operations on a HashMap
        HashMap<String, Integer> courseCredits = new HashMap<>();
        courseCredits.put("Computer Science", 4);
        courseCredits.put("Mathematics", 3);
        courseCredits.put("Physics", 4);

        int totalCredits = 0;
        for (int credits : courseCredits.values()) {
            totalCredits += credits;
        }
        
        // Complex operation with credits and grades
        int calculatedValue = totalCredits * course.getGrades().get(1);
        System.out.println("Calculated value: " + calculatedValue);

        // Reading the grade
        /* read */ int firstGrade = course.getGrades().get(0);
        System.out.println("First grade: " + firstGrade);
    }
}