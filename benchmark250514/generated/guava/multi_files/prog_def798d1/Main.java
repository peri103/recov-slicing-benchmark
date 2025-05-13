public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollCourse("Math", 95);

        StudentCourses studentCourses = student.getCourses();
        if (studentCourses.getCourseScores().containsKey("Math")) {
            System.out.println("Student is enrolled in Math.");
        }

        Integer mathScore = studentCourses.getCourseScores().get("Math").iterator().next();
        System.out.println("Math Score: " + mathScore);

        /* read */ Integer retrievedScore = studentCourses.getCourseScores().get("Math").iterator().next();
        System.out.println("Retrieved Score: " + retrievedScore);
    }
}