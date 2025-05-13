public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course mathCourse = new Course(101, "Mathematics");
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        student1.enrollCourse(mathCourse.getCourseId());

        for (Student student : mathCourse.getStudents()) {
            System.out.println(student.getName() + " enrolled in " + mathCourse.getCourseName());
        }

        /* read */ boolean isEnrolled = student1.isEnrolled(101);
        System.out.println("Alice enrolled in Mathematics: " + isEnrolled);
    }
}