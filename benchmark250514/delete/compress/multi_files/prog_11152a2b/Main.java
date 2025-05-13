import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CRC32Handler crc32Handler = new CRC32Handler();
        crc32Handler.setCRC32Value(123456789);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            for (int grade : student.getGrades()) {
                System.out.println("Grade: " + grade);
            }
        }

        /* read */ long crc32Value = crc32Handler.getCRC32Value();
        System.out.println("CRC32 Value: " + crc32Value);

        HashMap<String, Integer> gradeMap = new HashMap<>();
        gradeMap.put(student1.getName(), student1.getGrades().get(0));
        gradeMap.put(student2.getName(), student2.getGrades().get(0));

        for (String studentName : gradeMap.keySet()) {
            System.out.println("First Grade of " + studentName + ": " + gradeMap.get(studentName));
        }
    }
}