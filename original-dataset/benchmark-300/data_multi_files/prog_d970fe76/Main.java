import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics", 101);
        Course physicsCourse = new Course("Physics", 102);

        // Storing grades for different courses
        student.storeGrade(mathCourse.getCourseName(), 95);
        student.storeGrade(physicsCourse.getCourseName(), 88);

        // Retrieving and printing grades
        Integer mathGrade = student.getGrade(mathCourse.getCourseName());
        Integer physicsGrade = student.getGrade(physicsCourse.getCourseName());

        System.out.println("Math Grade: " + mathGrade);
        System.out.println("Physics Grade: " + physicsGrade);

        // Additional unrelated operations
        HashMap<String, Integer> tempMap = new HashMap<>();
        tempMap.put("tempKey", 100);
        int tempValue = tempMap.get("tempKey");
        System.out.println("Temp Value: " + tempValue);

        // Retrieving the main value
        /* read */ Integer mainValue = student.getGrade(mathCourse.getCourseName());
        System.out.println("Main Value: " + mainValue);
    }
}