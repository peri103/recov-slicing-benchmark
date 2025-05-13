public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        gzipWrapper.setGzipFlags(3);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Enrolled Students in " + course.getEnrolledStudents().size() + " course:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId());
        }

        /* read */ int flags = gzipWrapper.getGzipFlags();
        System.out.println("Gzip Flags: " + flags);
    }
}