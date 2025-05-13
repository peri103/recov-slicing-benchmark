public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = student.getCourse();
        mathCourse.addGrade(student.getName(), "A");

        // Some unrelated operations
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Retrieve and print the grade
        /* read */ String grade = mathCourse.getGrade(student.getName());
        System.out.println(student.getName() + "'s grade in " + mathCourse.getCourseName() + ": " + grade);

        // Further unrelated operations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}