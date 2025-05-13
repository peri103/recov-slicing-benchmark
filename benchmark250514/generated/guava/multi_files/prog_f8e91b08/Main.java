public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", 20);

        // Create a course and add the student's score
        Course course = new Course("Mathematics");
        course.addStudentScore(student.getName(), 85);

        // Some unrelated operations
        int totalStudents = 30;
        int passingScore = 50;
        if (course.getStudentScore(student.getName()) > passingScore) {
            System.out.println(student.getName() + " has passed the course.");
        } else {
            System.out.println(student.getName() + " has not passed the course.");
        }

        // Access the student's score from the course
        int studentScore = course.getStudentScore(student.getName());
        System.out.println("Score for " + student.getName() + " in " + course.getCourseName() + ": " + studentScore);

        // Final operations
        if (totalStudents > 25) {
            System.out.println("The class is quite large.");
        } else {
            System.out.println("The class size is manageable.");
        }
    }
}