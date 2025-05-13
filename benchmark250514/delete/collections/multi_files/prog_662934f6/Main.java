public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", 20);

        // Create a course and enroll the student
        Course course = new Course("Mathematics");
        student.enrollInCourse(course);

        // Add a grade for the student
        course.addGrade(student.getName(), 95);

        // Retrieve and print the student's grade
        /* read */ int grade = course.getGrade(student.getName());
        System.out.println("Student's grade in " + course.getCourseName() + ": " + grade);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}