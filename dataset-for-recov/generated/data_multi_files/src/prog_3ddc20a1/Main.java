public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        dequeOps.addElement(42);

        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        alice.enrollCourse("Mathematics");
        mathCourse.enrollStudent(alice);

        System.out.println("Course: " + mathCourse.getCourseName());
        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled Courses: " + student.getCourses());
        }

        try {
            /* read */ int lastElement = dequeOps.removeLastElement();
            System.out.println("Last element removed from deque: " + lastElement);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!dequeOps.isEmpty()) {
            System.out.println("Deque is not empty");
        } else {
            System.out.println("Deque is empty");
        }
    }
}