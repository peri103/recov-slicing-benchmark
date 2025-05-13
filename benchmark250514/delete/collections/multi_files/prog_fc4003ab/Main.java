public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        Course course = new Course("Mathematics");

        student.enrollInCourse(course);
        course.assignGrade(student.getName(), "A");

        // Additional operations
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Enrolled Course: " + student.getCourse().getCourseName());

        // Read operation
        /* read */ String grade = course.getStudentGrade(student.getName());
        System.out.println("Grade in " + course.getCourseName() + ": " + grade);

        // More operations
        Course anotherCourse = new Course("History");
        anotherCourse.assignGrade(student.getName(), "B");
        System.out.println("Grade in " + anotherCourse.getCourseName() + ": " + anotherCourse.getStudentGrade(student.getName()));
    }
}