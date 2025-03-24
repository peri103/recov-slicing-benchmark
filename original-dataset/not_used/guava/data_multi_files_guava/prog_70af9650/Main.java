import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer, Integer, String> builder = ImmutableTable.builder();
        /* write */ builder.put(1, 2, "Hello");
        ImmutableTable<Integer, Integer, String> table = builder.build();
        
        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addScore(95);
        student2.addScore(88);
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        // Display enrolled students
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Score: " + student.getScores().get(0));
        }
        
        /* read */ String value = table.get(1, 2);
        System.out.println(value);
    }
}