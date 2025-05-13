public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Add scores to students
        student1.addScore("Math", 95);
        student2.addScore("Science", 88);

        // Create a course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Retrieve and print student details
        Student retrievedStudent = course.getStudent("Alice");
        System.out.println("Student Name: " + retrievedStudent.getName());
        System.out.println("Student Age: " + retrievedStudent.getAge());

        // Retrieve and print scores
        StudentScores scores = retrievedStudent.getScores();
        /* read */ Integer mathScore = scores.getScore("Math");
        System.out.println("Math Score: " + mathScore);
    }
}