public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        student1.addRange(1, 10);

        Student student2 = new Student("Bob");
        student2.addRange(20, 30);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ boolean containsFive = student.isValueInRange(5);
            System.out.println("Is 5 in range for " + student.getName() + "? " + containsFive);
        }
    }
}