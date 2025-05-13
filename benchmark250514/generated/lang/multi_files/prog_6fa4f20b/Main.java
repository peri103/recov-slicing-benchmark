public class Main {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Create a course and add students to it
        Course course = new Course("Computer Science");
        course.addStudent(student1);
        course.addStudent(student2);

        // Check equality of two student objects
        EqualsChecker equalsChecker = new EqualsChecker();
        equalsChecker.appendObjects(student1, student1); // Comparing the same object
        /* read */ boolean areEqual = equalsChecker.checkEquality();

        // Output results
        System.out.println("Are the students equal? " + areEqual);

        // Output student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}