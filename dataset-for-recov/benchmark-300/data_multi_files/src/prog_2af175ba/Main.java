import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        Student student = new Student("John Doe");

        // Add some grades to the student
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);

        // Add data to the DataManager
        dataManager.addData("studentId", 12345);

        // Retrieve the data from the DataManager
        SortedMap<String, Integer> dataMap = dataManager.getDataMap();
        /* read */ int studentId = dataMap.get("studentId");

        // Print the student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + studentId);
        System.out.println("Grades: " + student.getGrades());
    }
}