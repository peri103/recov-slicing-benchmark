public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "S12345");
        Course course = new Course("Data Structures");
        student.enrollInCourse(course);

        course.addGrade("student1", "assignment1", 95);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Retrieve and print the grade
        Course enrolledCourse = student.getCourse();
        /* read */ Integer grade = enrolledCourse.getGrade("student1", "assignment1");
        System.out.println("Grade for assignment1: " + grade);

        // Additional operations
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Course Name: " + enrolledCourse.getCourseName());
    }
}