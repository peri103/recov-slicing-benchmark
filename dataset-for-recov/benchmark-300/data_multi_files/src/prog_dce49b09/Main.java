import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.storeGrade("Math", 95);
        student.storeGrade("Science", 88);

        TreeMap<String, Integer> grades = student.getDataManager().getDataMap();
        /* read */ int mathGrade = grades.get("Math");
        System.out.println("Math Grade: " + mathGrade);

        // Display all grades
        for (String subject : grades.keySet()) {
            System.out.println("Subject: " + subject + ", Grade: " + grades.get(subject));
        }
    }
}