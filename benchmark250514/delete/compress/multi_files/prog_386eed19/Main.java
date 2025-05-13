import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a GzipExtraData object and set extra data
        GzipExtraData gzipExtraData = new GzipExtraData();
        gzipExtraData.setExtraData(new byte[]{1, 2, 3, 4});

        // Create a student and enroll them in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        // Perform operations on student courses
        for (String course : student.getCourses()) {
            System.out.println(student.getName() + " is enrolled in: " + course);
        }

        // Create a map to store student grades
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Mathematics", 85);
        studentGrades.put("Science", 90);

        // Perform operations on student grades
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Grade in " + entry.getKey() + ": " + entry.getValue());
        }

        // Read the extra data from GzipExtraData
        /* read */ byte[] extraData = gzipExtraData.getExtraData();

        // Print the extra data
        System.out.print("Extra data: ");
        for (byte b : extraData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}