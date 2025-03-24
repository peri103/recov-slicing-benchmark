import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.addGrade(90);
        student2.addGrade(85);

        for (Student student : course.getStudents()) {
            SortedSet<Integer> grades = student.getGrades();
            /* read */ boolean contains = grades.contains(90);
            System.out.println(student.getName() + " has grade 90: " + contains);
        }
    }
}