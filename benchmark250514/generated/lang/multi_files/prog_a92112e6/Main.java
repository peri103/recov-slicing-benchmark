public class Main {
    public static void main(String[] args) {
        // Create a text manipulator and perform operations
        TextManipulator textManipulator = new TextManipulator("Hello World");
        textManipulator.appendText(" - Java Programming");
        textManipulator.insertText(5, ",");
        textManipulator.replaceText(0, 5, "Hi");
        textManipulator.modifyText();

        // Create a course and enroll students
        Course course = new Course("Advanced Java");
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print course details
        System.out.println("Course Name: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Get and print the final text
        String finalText = textManipulator.getText();
        System.out.println("Final Text: " + finalText);

        // Print additional text manipulator details
        System.out.println("Text Length: " + textManipulator.getLength());
        System.out.println("Text Capacity: " + textManipulator.getCapacity());
    }
}