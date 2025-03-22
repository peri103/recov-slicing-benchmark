public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "Science");

        student1.enrollCourse(101);
        course1.addStudent(student1);

        student2.enrollCourse(102);
        course2.addStudent(student2);

        // Check enrollment
        /* read */ boolean isEnrolledInMath = student1.isEnrolled(101);
        System.out.println(student1.getName() + " enrolled in Mathematics: " + isEnrolledInMath);

        // Additional operations
        System.out.println("Students in Mathematics:");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students in Science:");
        for (Student student : course2.getStudents()) {
            System.out.println(student.getName());
        }
    }
}