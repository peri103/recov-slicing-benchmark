public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice", 3);
        course.addStudent(student);

        student.setScore(1, 2, 95.0);

        // Perform some unrelated operations
        double unrelatedCalculation = 1.0;
        for (int i = 1; i <= 3; i++) {
            unrelatedCalculation *= i;
        }
        System.out.println("Unrelated calculation result: " + unrelatedCalculation);

        double score = student.getScore(1, 2);
        /* read */ System.out.println("Score for Alice in subject (1, 2): " + score);

        // More operations on the course
        for (Student s : course.getStudents()) {
            System.out.println("Student in course: " + s.getName());
        }
    }
}