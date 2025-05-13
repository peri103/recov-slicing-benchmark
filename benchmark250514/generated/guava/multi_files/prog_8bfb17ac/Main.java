public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Advanced Programming");

        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Add scores to the students
        student1.addScore(85);
        student2.addScore(90);

        // Retrieve and print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Score: " + student.getScores().getScore());
            System.out.println();
        }
    }
}