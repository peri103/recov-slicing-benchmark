public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics", 101);

        student.storeGrade(mathCourse.getCourseName(), 95);

        // Perform some other operations
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + mathCourse.getCourseName() + " (Code: " + mathCourse.getCourseCode() + ")");

        /* read */ Integer grade = student.getGrade(mathCourse.getCourseName());
        System.out.println("Grade in " + mathCourse.getCourseName() + ": " + grade);
    }
}