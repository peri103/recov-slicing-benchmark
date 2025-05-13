public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollInCourse("Physics");

        Course course = student.getCourse();
        System.out.println("Course: " + course.getCourseName());

        double[] newGrades = {75.0, 80.0, 85.0};
        course.updateGrades(newGrades, 1);

        RealVector grades = course.getGrades(1);
        System.out.println("Updated Grades: " + grades);
    }
}