public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("John Doe");

        // Create a new course and add an assignment
        Course mathCourse = new Course("Mathematics");
        mathCourse.addAssignment(student.getName(), "Algebra Homework");

        // Enroll student in the course
        student.enrollCourse(mathCourse);

        // Retrieve assignment details for the student from the course
        String assignmentDetail = mathCourse.getAssignmentDetail(student.getName());
        System.out.println("Assignment for " + student.getName() + " in " + mathCourse.getCourseName() + ": " + assignmentDetail);
    }
}