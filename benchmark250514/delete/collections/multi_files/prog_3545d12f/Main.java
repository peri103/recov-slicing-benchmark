public class Main {
    public static void main(String[] args) {
        // Creating a student and enrolling in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics", 85);
        student.enrollCourse("Science", 90);

        // Creating a course and adding student grades
        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudentGrade(student.getName(), 85);

        // Retrieve and print the student's grade for Mathematics
        Integer mathGrade = mathCourse.getStudentGrade(student.getName());
        System.out.println("Student: " + student.getName() + ", Course: " + mathCourse.getCourseName() + ", Grade: " + mathGrade);
    }
}