public class Main {
    public static void main(String[] args) {
        // Create instances of Student and Course
        Student student = new Student("John Doe");
        Course course = new Course("Mathematics");

        // Create an instance of UniversityDatabase
        UniversityDatabase universityDatabase = new UniversityDatabase();

        // Enroll the student in the course with a score
        universityDatabase.enrollStudentInCourse(student.getName(), course.getCourseName(), 85);

        // Unrelated data structures for complexity
        int[] grades = {90, 80, 85, 70};
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        System.out.println("Average grade: " + (sum / grades.length));

        // Read the student's score from the course
        /* read */ Integer score = universityDatabase.getStudentScore(student.getName(), course.getCourseName());

        // Print the score
        System.out.println("Student's score in " + course.getCourseName() + ": " + score);
    }
}