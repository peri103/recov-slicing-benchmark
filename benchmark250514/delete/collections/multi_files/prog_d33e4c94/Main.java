public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice");

        // Create a course
        Course math = new Course("Mathematics");

        // Enroll the student in the course
        student.enrollCourse(math);

        // Add a grade for the student in the course
        math.addStudentGrade(student.getName(), 95);

        // Get and print the student's grade in the course
        Integer grade = math.getStudentGrade(student.getName());
        /* read */ System.out.println("Grade for " + student.getName() + " in " + math.getCourseName() + ": " + grade);
    }
}