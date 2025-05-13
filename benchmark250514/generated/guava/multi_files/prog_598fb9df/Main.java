public class Main {
    public static void main(String[] args) {
        RangeManager rangeManager = new RangeManager();
        Course course = new Course("Math 101");

        // Enroll students in the course
        for (int i = 1; i <= 20; i++) {
            course.enrollStudent(i);
        }

        // Add a range to the RangeManager
        rangeManager.addRange(1, 10);

        // Check student enrollment
        boolean isEnrolled = course.isStudentEnrolled(5);
        System.out.println("Student 5 enrolled in Math 101: " + isEnrolled);

        // Remove a student and check again
        course.unenrollStudent(5);
        isEnrolled = course.isStudentEnrolled(5);
        System.out.println("Student 5 enrolled in Math 101 after removal: " + isEnrolled);

        // Check if a number is in the RangeManager
        /* read */ boolean containsValue = rangeManager.checkContains(5);
        System.out.println("Number 5 in RangeManager: " + containsValue);

        // Remove a range and check again
        rangeManager.removeRange(5, 10);
        containsValue = rangeManager.checkContains(5);
        System.out.println("Number 5 in RangeManager after removal: " + containsValue);
    }
}