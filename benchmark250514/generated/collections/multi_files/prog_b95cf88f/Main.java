public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create a student and enroll in the course
        Student student = new Student("Alice", 20, course);

        // Add a grade for the student
        course.addGrade(student.getName(), 95);

        // Retrieve and print the grade
        /* read */ Integer grade = course.getGrade(student.getName());
        System.out.println("Grade for " + student.getName() + " in " + student.getCourse().getCourseName() + ": " + grade);

        // Additional operations
        Student anotherStudent = new Student("Bob", 22, course);
        course.addGrade(anotherStudent.getName(), 88);

        Integer anotherGrade = course.getGrade(anotherStudent.getName());
        System.out.println("Grade for " + anotherStudent.getName() + " in " + anotherStudent.getCourse().getCourseName() + ": " + anotherGrade);
    }
}