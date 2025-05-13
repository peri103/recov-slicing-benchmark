public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.enrollSubject("Mathematics");
        student1.enrollSubject("Algorithms");
        student2.enrollSubject("Data Structures");
        student2.enrollSubject("Operating Systems");

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled in: " + student.getSubject(0));
        }
    }
}