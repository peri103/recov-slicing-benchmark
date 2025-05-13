import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addCourse("Mathematics");
        student.addCourse("Physics");

        // Set the link name using LinkManager
        student.setLinkName("studentProfileLink");

        // Additional data structures
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");

        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Mathematics", 85);
        grades.put("Physics", 90);

        // Operations on the data structures
        for (String course : student.getCourses()) {
            System.out.println("Course: " + course);
        }

        for (String hobby : hobbies) {
            System.out.println("Hobby: " + hobby);
        }

        for (String subject : grades.keySet()) {
            System.out.println("Grade in " + subject + ": " + grades.get(subject));
        }

        // Retrieve the link name
        /* read */ String linkName = student.getLinkName();
        System.out.println("Link Name: " + linkName);
    }
}