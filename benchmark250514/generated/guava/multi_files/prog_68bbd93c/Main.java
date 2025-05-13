public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics");

        student.enrollInCourse(math);
        math.addStudentScore(student.getName(), 95);

        Course enrolledCourse = student.getCourses().get(0);
        Integer score = enrolledCourse.getStudentScore(student.getName());
        System.out.println("Score for " + student.getName() + " in " + enrolledCourse.getCourseName() + ": " + score);

        Course science = new Course("Science");
        student.enrollInCourse(science);
        science.addStudentScore(student.getName(), 88);

        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName() + ", Score: " + course.getStudentScore(student.getName()));
        }
    }
}