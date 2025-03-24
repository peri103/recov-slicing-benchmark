public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.storeScore(95);

        // Perform some unrelated operations
        for (int i = 0; i < 10; i++) {
            System.out.println("Processing student data...");
        }

        /* read */ int score = student.getScore();
        System.out.println("Student's score: " + score);

        // Perform some final operations
        for (Student s : course.getStudents()) {
            System.out.println("Student Name: " + s.getName());
        }
    }
}