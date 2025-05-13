public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.enrollInCourse("Mathematics", 3);
        student.enrollInCourse("Physics", 4);

        CourseEnrollment enrollment = student.getEnrollment();
        Integer mathCredits = enrollment.getCourseCredits("Mathematics");
        Integer physicsCredits = enrollment.getCourseCredits("Physics");

        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Mathematics Credits: " + mathCredits);
        System.out.println("Physics Credits: " + physicsCredits);
    }
}