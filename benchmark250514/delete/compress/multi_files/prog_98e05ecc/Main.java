import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipHelper gzipHelper = new GzipHelper();
        byte[] extraData = new byte[]{10, 20, 30, 40};

        gzipHelper.setExtraData(extraData);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1.getName());
        studentMap.put(student2.getId(), student2.getName());

        int sumOfIds = 0;
        for (int id : studentMap.keySet()) {
            sumOfIds += id;
        }

        System.out.println("Sum of Student IDs: " + sumOfIds);

        /* read */ byte[] retrievedData = gzipHelper.getExtraData();

        System.out.print("Retrieved Gzip extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}