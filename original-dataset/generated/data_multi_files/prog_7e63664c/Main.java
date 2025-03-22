public class Main {
    public static void main(String[] args) {
        DequeManager dequeManager = new DequeManager();

        // Add elements to the deque
        dequeManager.addElement(42);
        dequeManager.addMultipleElements(new int[]{10, 20, 30, 40});

        try {
            // Retrieve and print the last element added
            int lastElement = dequeManager.retrieveLastElement();
            System.out.println("Last Element from Deque: " + lastElement);

            // Work with student and course data
            Student student1 = new Student("Alice");
            student1.addGrade(85);
            student1.addGrade(90);

            Student student2 = new Student("Bob");
            student2.addGrade(78);
            student2.addGrade(82);

            Course course = new Course("Mathematics");
            course.enrollStudent(student1);
            course.enrollStudent(student2);

            for (Student student : course.getEnrolledStudents()) {
                System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}