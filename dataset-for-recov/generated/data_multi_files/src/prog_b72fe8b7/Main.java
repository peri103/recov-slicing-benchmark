public class Main {
    public static void main(String[] args) {
        // Initialize ConcurrentDequeManager
        ConcurrentDequeManager dequeManager = new ConcurrentDequeManager();

        // Add elements using ConcurrentDequeManager
        dequeManager.addLastElement(10);
        dequeManager.addLastElement(20);
        dequeManager.addFirstElement(42);

        // Peek first element
        /* read */ Integer firstElement = dequeManager.peekFirstElement();
        System.out.println("First element in deque: " + firstElement);

        // Print all elements in deque
        dequeManager.printAllElements();

        // Initialize Course and Student
        Course course = new Course("Math");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add scores to students
        student1.addScore(95);
        student2.addScore(85);

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students and their scores
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student student : course.getStudents()) {
            System.out.println("Name: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}