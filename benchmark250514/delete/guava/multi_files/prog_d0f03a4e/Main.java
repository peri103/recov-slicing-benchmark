public class Main {
    public static void main(String[] args) {
        // Creating a student and adding scores
        Student student = new Student("Alice");
        System.out.println("Student Name: " + student.getName());

        // Accessing the initial score from StudentScores
        Integer initialScore = student.getScores().getInitialScore();
        System.out.println("Initial Score: " + initialScore);

        // Creating a course and adding the student
        Course course = new Course("Mathematics");
        course.addStudent(student);

        // Display course details
        System.out.println("Course Name: " + course.getCourseName());
        for (Student enrolledStudent : course.getStudents()) {
            System.out.println("Enrolled Student: " + enrolledStudent.getName());
        }
    }
}