public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student.addCourse(math);
        student.addCourse(science);

        math.setScore(95.5);
        science.setScore(89.0);

        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            /* read */ double score = course.getScore();
            System.out.println("Score: " + score);
        }
    }
}