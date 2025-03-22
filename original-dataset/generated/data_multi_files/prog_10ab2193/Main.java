public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        queueManager.offerToQueue(42);

        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        student.addGrade(95);
        student.addGrade(85);
        course.enrollStudent(student);

        Student retrievedStudent = course.getStudent("Alice");
        System.out.println("Grades for " + retrievedStudent.getName() + ": " + retrievedStudent.getGrades());

        Integer polledValue = queueManager.getQueue().poll();
        /* read */ System.out.println("Polled from queue: " + polledValue);
    }
}