public class Main {
    public static void main(String[] args) {
        // Create a student with a matrix for grades
        Student student = new Student("Alice", 3);

        // Set a grade for a course
        student.setGrade(0, 85.0);

        // Perform some unrelated calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Retrieve the grade for the course
        /* read */ double grade = student.getGrade(0);

        // Print the retrieved grade
        System.out.println("Grade for course 0: " + grade);
    }
}