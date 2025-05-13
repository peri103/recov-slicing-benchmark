import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enroll("Mathematics", 3);
        student.enroll("Science", 4);

        LinkedMap<String, Integer> studentCourses = student.getCourse().getCourses();
        
        int totalCredits = 0;
        for (Map.Entry<String, Integer> course : studentCourses.entrySet()) {
            System.out.println(course.getKey() + ": " + course.getValue() + " credits");
            totalCredits += course.getValue();
        }

        /* read */ Integer mathCredits = studentCourses.get("Mathematics");
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Credits for Mathematics: " + mathCredits);
    }
}