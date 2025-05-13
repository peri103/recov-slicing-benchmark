import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "Initial Notes");

        // ArrayList demonstration
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");

        // HashMap demonstration
        HashMap<Integer, String> grades = new HashMap<>();
        grades.put(1, "A");
        grades.put(2, "B");

        // Display initial notes
        System.out.println("Student: " + student.getName());
        System.out.println("Initial Notes: " + student.getNotes());

        // Clear notes and add new content
        student.clearNotes();
        student.addNotes("New Notes Content");

        // Display subjects
        for (String subject : subjects) {
            System.out.println("Subject: " + subject);
        }

        // Display grades
        for (Integer key : grades.keySet()) {
            System.out.println("Grade for subject " + key + ": " + grades.get(key));
        }

        // Read the final notes
        /* read */ String finalNotes = student.getNotes();
        System.out.println("Final Notes: " + finalNotes);
    }
}