import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.storeGrade(85);
        
        // Unrelated code to make the program more complex
        HashSet<String> courses = new HashSet<>();
        courses.add("Mathematics");
        courses.add("Physics");
        courses.add("Chemistry");
        
        for (String course : courses) {
            System.out.println("Enrolled in: " + course);
        }
        
        /* read */ boolean hasGrade = student.getGrades().contains(85);
        System.out.println("Does the student have a grade of 85? " + hasGrade);
    }
}