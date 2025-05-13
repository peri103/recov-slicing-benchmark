public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1);
        Course course = new Course("Mathematics");
        
        course.enrollStudent(student);
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (Student s : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + s.getName() + ", ID: " + s.getId());
        }

        StudentScores studentScores = new StudentScores();
        studentScores.addScore("Math", 95);
        studentScores.addScore("Science", 88);

        System.out.println("Scores for " + student.getName() + ":");
        System.out.println("Math: " + studentScores.getScore("Math"));
        System.out.println("Science: " + studentScores.getScore("Science"));
    }
}