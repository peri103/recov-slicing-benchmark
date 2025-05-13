public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        Course course = new Course("Mathematics");

        student.enroll(course);
        course.addStudentScore(student.getName(), "Midterm", 85);

        // Perform some unrelated operations
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += i;
        }
        System.out.println("Sum of first 5 integers: " + total);

        // Retrieve and print the student's score for the Midterm exam
        /* read */ Integer score = course.getStudentScore(student.getName(), "Midterm");
        System.out.println(student.getName() + "'s score in " + course.getCourseName() + " Midterm: " + score);

        // Perform further unrelated operations
        int squaredSum = 0;
        for (int i = 1; i <= 3; i++) {
            squaredSum += i * i;
        }
        System.out.println("Sum of squares of first 3 integers: " + squaredSum);
    }
}