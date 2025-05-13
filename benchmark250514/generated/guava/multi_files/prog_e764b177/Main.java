public class Main {
    public static void main(String[] args) {
        RangeManager rangeManager = new RangeManager();
        Course course = new Course("Math 101");

        // Enroll students in the course
        for (int i = 1; i <= 15; i++) {
            course.enrollStudent(i);
        }

        // Add a range to the RangeManager
        rangeManager.addRange(1, 10);

        // Check if specific students are enrolled
        System.out.println("Student 5 enrolled: " + course.isStudentEnrolled(5));
        System.out.println("Student 20 enrolled: " + course.isStudentEnrolled(20));

        // Check if specific values are within the range
        boolean containsValue;
        for (int i = 0; i < 3; i++) {
            int checkValue = i * 5;
            containsValue = rangeManager.checkValue(checkValue);
            System.out.println("Range contains " + checkValue + ": " + containsValue);
        }

        // Final read operation
        /* read */ containsValue = rangeManager.checkValue(5);

        System.out.println("Final check, Range contains 5: " + containsValue);
    }
}