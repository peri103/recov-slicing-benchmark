public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create a student and add scores
        Student student = new Student("John");
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);

        // Add student to the course
        course.addStudent(student);

        // Check if a specific score exists for the student
        boolean hasScore = student.hasScore(90);
        System.out.println("Does John have a score of 90? " + hasScore);

        // Print course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
        }
    }
}