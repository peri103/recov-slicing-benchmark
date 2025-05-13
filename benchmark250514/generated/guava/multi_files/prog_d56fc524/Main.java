import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a new student and enroll in a course
        Student student = new Student("John Doe", 20);
        student.enrollInCourse("Mathematics", 4);

        // Retrieve the courses and read the credits for a specific course
        ImmutableSortedMap<String, Integer> courses = student.getCourse().getCourses();
        /* read */ Integer credits = courses.get("Mathematics");
        
        System.out.println("Credits for Mathematics: " + credits);

        // Additional unrelated operations
        int totalCredits = 0;
        for (String courseName : courses.keySet()) {
            totalCredits += courses.get(courseName);
        }
        System.out.println("Total credits enrolled: " + totalCredits);
    }
}