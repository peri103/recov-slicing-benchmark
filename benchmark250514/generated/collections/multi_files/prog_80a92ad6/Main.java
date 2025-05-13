public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("Alice", mathCourse);

        // Adding grade for the student
        student.getCourse().addGrade(student.getName(), 95);

        // Some unrelated logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Fetching the grade for the student
        int grade = student.getCourse().getGrade(student.getName());
        System.out.println("Grade for " + student.getName() + " in " + student.getCourse().getCourseName() + ": " + grade);

        // Additional logic
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 integers: " + product);
    }
}