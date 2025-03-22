public class Main {
    public static void main(String[] args) {
        // Using the NumberSet class
        NumberSet numberSet = new NumberSet();
        numberSet.addNumber(10);
        numberSet.addNumber(20);
        numberSet.addNumber(30);

        // Check if a number is present in the set
        /* read */ boolean containsValue = numberSet.containsNumber(10);
        System.out.println("NumberSet contains 10: " + containsValue);

        // Using the Student class
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());
    }
}