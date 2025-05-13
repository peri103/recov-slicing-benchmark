import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a course and add grades
        Course mathCourse = new Course("Mathematics");
        mathCourse.addGrade(95);
        mathCourse.addGrade(85);
        mathCourse.addGrade(75);

        // Create a student enrolled in the course
        Student student = new Student("John Doe", 20, mathCourse);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Enrolled Course: " + student.getCourse().getCourseName());

        // Perform some unrelated operations
        ImmutableMap<String, String> map = ImmutableMap.of("key1", "value1", "key2", "value2");
        System.out.println("Map contains key1: " + map.get("key1"));
        
        // Retrieve grades from the course
        ImmutableList<Integer> grades = student.getCourse().getGrades();

        // Calculate the average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / (double) grades.size();
        System.out.println("Average Grade: " + average);

        // Read the first grade
        /* read */ int firstGrade = grades.get(0);
        System.out.println("First Grade: " + firstGrade);
    }
}