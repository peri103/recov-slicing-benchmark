public class Main {
    public static void main(String[] args) {
        RangeManager rangeManager = new RangeManager();
        rangeManager.addRange(1, 10);
        rangeManager.addRange(20, 30);
        rangeManager.addRange(40, 50);

        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(101);
        mathCourse.enrollStudent(102);

        System.out.println("Enrolled students in " + mathCourse.getCourseName() + ":");
        for (Integer studentId : mathCourse.getEnrolledStudents()) {
            System.out.println("Student ID: " + studentId);
        }

        // Further operations on RangeManager
        boolean containsValue1 = rangeManager.containsValue(8);
        boolean containsValue2 = rangeManager.containsValue(28);
        System.out.println("Contains 8: " + containsValue1);
        System.out.println("Contains 28: " + containsValue2);

        // Finally, check if the specific value is contained in the RangeManager
        /* read */ boolean containsValue = rangeManager.containsValue(5);
        System.out.println("Contains 5: " + containsValue);
    }
}