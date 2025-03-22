public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        Course course = new Course("Mathematics");
        
        student.enrollInCourse(course);
        course.addStudentGrade(student.getName(), 95);

        int grade = course.getStudentGrade(student.getName());
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        System.out.println("Course: " + course.getCourseName() + ", Grade: " + grade);
    }
}