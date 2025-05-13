import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpUser dumpUser = new DumpUser();
        dumpUser.setUserId(1001);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);

        for (String name : studentMap.keySet()) {
            Student student = studentMap.get(name);
            System.out.println("Student: " + name + ", Average Grade: " + student.calculateAverage());
        }

        /* read */ long userId = dumpUser.getUserId();
        System.out.println("User ID: " + userId);
    }
}