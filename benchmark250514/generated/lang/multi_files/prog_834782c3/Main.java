import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        StrBuilderOperations strBuilderOps = new StrBuilderOperations("Hello World!");
        strBuilderOps.modifyString();

        HashMap<String, String> infoMap = new HashMap<>();
        infoMap.put("Instructor", "Dr. Smith");
        infoMap.put("Semester", "Fall 2023");

        for (String key : infoMap.keySet()) {
            System.out.println(key + ": " + infoMap.get(key));
        }

        /* read */ String finalString = strBuilderOps.getString();
        System.out.println("Final StrBuilder content: " + finalString);
    }
}