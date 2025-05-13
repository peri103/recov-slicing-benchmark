public class Main {
    public static void main(String[] args) {
        // Create a course and a student
        Course course = new Course("Mathematics");
        Student student = new Student("John Doe");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Add a grade for the student
        student.addGrade("Mathematics", 95);

        // Retrieve and print the grade
        Integer grade = student.getGrade("Mathematics");
        System.out.println("Grade for " + student.getName() + " in Mathematics: " + grade);

        // Further operations on courses and students
        for (Student s : course.getEnrolledStudents()) {
            System.out.println("Enrolled student: " + s.getName());
        }
    }
}