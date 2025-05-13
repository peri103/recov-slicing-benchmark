public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollCourse("Mathematics");
        student.addScore("Algebra", 95);

        // Additional operations
        student.enrollCourse("Science");
        student.addScore("Physics", 85);

        // Retrieve and print scores
        String courseName = student.getCourseName();
        System.out.println("Course: " + courseName);

        /* read */ Integer score = student.getScore("Algebra");
        System.out.println("Score in Algebra: " + score);

        // More operations
        Integer physicsScore = student.getScore("Physics");
        System.out.println("Score in Physics: " + physicsScore);
    }
}