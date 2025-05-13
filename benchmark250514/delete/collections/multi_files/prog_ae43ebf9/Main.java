import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create courses
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Enroll students in courses
        math.addStudent(alice);
        science.addStudent(bob);

        // DataStore for tracking enrollments
        DataStore dataStore = new DataStore();
        dataStore.addEnrollment(alice.getName(), math.getCourseName());
        dataStore.addEnrollment(bob.getName(), science.getCourseName());

        // Get the student-course mapping
        MultiValuedMap<String, String> studentCourseMap = dataStore.getStudentCourseMap();

        // Additional operations
        for (String studentName : studentCourseMap.keySet()) {
            System.out.println("Student: " + studentName);
            for (String courseName : studentCourseMap.get(studentName)) {
                System.out.println("Enrolled in: " + courseName);
            }
        }

        // Read operation
        /* read */ String firstCourse = studentCourseMap.get("Alice").iterator().next();
        System.out.println("Alice's first course: " + firstCourse);
    }
}