public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        queueManager.addToQueue(42);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.name);
            for (int score : student.getScores()) {
                System.out.println("Score: " + score);
            }
        }

        try {
            /* read */ int value = queueManager.getQueue().take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}