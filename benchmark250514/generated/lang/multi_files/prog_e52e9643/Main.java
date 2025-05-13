import java.util.List;

public class Main {
    public static void main(String[] args) {
        StopWatchHandler stopWatchHandler = new StopWatchHandler();
        Course course = new Course("Computer Science");

        Student student1 = new Student("Alice");
        student1.addGrade(85);
        student1.addGrade(90);

        Student student2 = new Student("Bob");
        student2.addGrade(78);
        student2.addGrade(82);

        course.addStudent(student1);
        course.addStudent(student2);

        stopWatchHandler.startTimer();

        // Processing student grades
        for (Student student : course.getStudents()) {
            List<Integer> grades = student.getGrades();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = sum / (double) grades.size();
            System.out.println(student.getName() + "'s average grade: " + average);
        }

        long timeElapsed = stopWatchHandler.getElapsedTime();
        System.out.println("Time elapsed for processing: " + timeElapsed + " milliseconds");
    }
}