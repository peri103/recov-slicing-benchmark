public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollCourse("Mathematics");
        student.addGrade("Algebra", 85);

        String courseName = student.getCourseName();
        System.out.println("Enrolled Course: " + courseName);

        int grade = student.getGrade("Algebra");
        System.out.println("Grade in Algebra: " + grade);
    }
}