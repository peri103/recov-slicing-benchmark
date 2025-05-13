import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Working with CustomMap
        CustomMap customMap = new CustomMap();
        customMap.addValue("key", 42);

        // Working with Student and Course
        Student student1 = new Student("Alice");
        student1.addScore(95);
        student1.addScore(87);

        Student student2 = new Student("Bob");
        student2.addScore(78);
        student2.addScore(82);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }

        // Original read operation
        /* read */ Integer value = customMap.getUnmodifiableMultiMap().get("key").iterator().next();
        System.out.println("Read value from CustomMap: " + value);
    }
}