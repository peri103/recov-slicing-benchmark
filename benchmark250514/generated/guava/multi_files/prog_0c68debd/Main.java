public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.enrollInCourse("Math");
        
        Course course = student.getCourse();
        course.addScore(student.getName(), "Midterm", 85);
        
        // Perform some unrelated operations
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum of a and b: " + sum);

        // Retrieve and print the score
        /* read */ Integer score = course.getScore(student.getName(), "Midterm");
        System.out.println("Midterm score for " + student.getName() + ": " + score);
        
        // More operations
        int diff = b - a;
        System.out.println("Difference of b and a: " + diff);
    }
}