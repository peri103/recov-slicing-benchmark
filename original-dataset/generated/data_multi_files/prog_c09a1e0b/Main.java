public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1);
        Course course = new Course("Mathematics");

        course.enrollStudent(student);
        student.addScore(95);
        student.addCourseGrade("Mathematics", 95);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Enrolled in: " + course.getCourseName());
        System.out.println("Has score 95: " + student.getScores().hasScore(95));
        System.out.println("Grade in Mathematics: " + student.getGradeForCourse("Mathematics"));
    }
}