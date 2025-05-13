public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student.enrollCourse(math);
        student.enrollCourse(science);

        math.addGrade(95);
        science.addGrade(88);

        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            /* read */ int grade = course.getGrade(0);
            System.out.println("Grade: " + grade);
        }
    }
}