import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollCourse("Math", "A");
        student.enrollCourse("Science", "B");

        HashMultimap<String, String> courses = student.getCourses();
        /* read */ String grade = courses.get("Math").iterator().next();
        System.out.println("Grade for Math: " + grade);

        student.enrollCourse("History", "A-");
        for (String course : courses.keySet()) {
            for (String g : courses.get(course)) {
                System.out.println("Course: " + course + " -> Grade: " + g);
            }
        }
    }
}