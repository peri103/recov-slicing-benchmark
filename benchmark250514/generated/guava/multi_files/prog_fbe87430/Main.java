public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 95);

        // Perform some unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Read the score for Math
        /* read */ Integer mathScore = student.getScore("Math");
        System.out.println("Math Score: " + mathScore);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}