public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course();
        Student student = new Student("John Doe");

        // Add grades for students
        mathCourse.addStudentGrade(student.getName(), "A");

        // Student completes a course
        student.completeCourse("Mathematics");

        // Retrieve and print student grade
        /* read */ String grade = mathCourse.getStudentGrade(student.getName());
        System.out.println("Grade for " + student.getName() + " in Mathematics: " + grade);

        // Print completed courses
        for (String course : student.getCompletedCourses()) {
            System.out.println(student.getName() + " completed: " + course);
        }
    }
}