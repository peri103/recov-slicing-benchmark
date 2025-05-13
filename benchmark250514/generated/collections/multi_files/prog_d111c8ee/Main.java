public class Main {
    public static void main(String[] args) {
        QueueHandler queueHandler = new QueueHandler();
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");

        // Add scores to the student
        student.addScore(85);
        student.addScore(90);
        student.addScore(75);

        // Add student to the course
        course.addStudent(student);

        // Add a value to the queue
        queueHandler.addToQueue(42);

        // Operations with the queue
        while (!queueHandler.isQueueEmpty()) {
            Integer element = queueHandler.pollQueue();
            if (element != null) {
                System.out.println("Polled from queue: " + element);
            }
        }

        // Peek the value from the queue
        /* read */ Integer peekedValue = queueHandler.peekQueue();
        System.out.println("Peeked value: " + peekedValue);

        // Retrieve and print scores of the student
        Student retrievedStudent = course.getStudent("Alice");
        if (retrievedStudent != null) {
            System.out.println("Scores of " + retrievedStudent.getName() + ": " + retrievedStudent.getScores());
        }
    }
}