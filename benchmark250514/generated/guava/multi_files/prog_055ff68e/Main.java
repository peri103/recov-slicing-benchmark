public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.completeCourse(101);
        student2.completeCourse(102);

        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println(student1.getName() + " completed course 101: " + student1.hasCompletedCourse(101));
        System.out.println(student2.getName() + " completed course 101: " + student2.hasCompletedCourse(101));

        for (Student student : university.getStudents()) {
            System.out.println(student.getName() + " completed course 102: " + student.hasCompletedCourse(102));
        }
    }
}