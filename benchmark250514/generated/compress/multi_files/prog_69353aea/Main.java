import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        HashMap<Integer, String> studentMap = new HashMap<>();
        for (Student student : course.getEnrolledStudents()) {
            studentMap.put(student.getId(), student.getName());
        }

        gzipWrapper.setFilename("course_info.txt");

        for (Integer id : studentMap.keySet()) {
            System.out.println("Student ID: " + id + ", Name: " + studentMap.get(id));
        }

        /* read */ String filename = gzipWrapper.getFilename();
        System.out.println("Filename set in GzipParametersWrapper: " + filename);
    }
}