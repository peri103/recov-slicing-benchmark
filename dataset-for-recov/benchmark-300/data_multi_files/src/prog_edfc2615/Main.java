import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addStudentData(1, "Hello");
        SortedMap<Integer, String> studentData = student.getStudentData();
        /* read */ String value = studentData.get(1);
        System.out.println("Value from Student Data: " + value);
    }
}