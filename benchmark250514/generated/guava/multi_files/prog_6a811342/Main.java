public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("John Doe", mathCourse);

        // Adding grades for the student in the course
        mathCourse.addGrade(85);
        mathCourse.addGrade(90);
        mathCourse.addGrade(85);

        // Unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        // Fetching and printing the count of a specific grade
        int gradeCount = student.getCourse().getGradeCount(85);
        System.out.println("Count of grade 85 in " + student.getCourse().getCourseName() + ": " + gradeCount);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}