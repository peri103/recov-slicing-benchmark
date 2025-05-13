public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("Alice", mathCourse);

        // Add course details
        student.getCourse().addCourseDetails("Advanced Mathematics");

        // Retrieve and print course details
        String courseDetail = student.getCourse().getCourseDetail();
        System.out.println("Course Detail: " + courseDetail);

        // Change course
        Course scienceCourse = new Course("Science");
        student.enrollInCourse(scienceCourse);
        student.getCourse().addCourseDetails("Physics and Chemistry");

        // Retrieve and print new course details
        String newCourseDetail = student.getCourse().getCourseDetail();
        System.out.println("New Course Detail: " + newCourseDetail);
    }
}