public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("John Doe", mathCourse);

        mathCourse.addGrade(student.getName(), "A");

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Retrieve the grade
        /* read */ String grade = student.getCourse().getGrade(student.getName());
        System.out.println("Grade for " + student.getName() + " in " + student.getCourse().getCourseName() + ": " + grade);

        // More unrelated operations
        String[] fruits = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}