public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.addContent(1, "Introduction to Java");
        course.addContent(2, "Object-Oriented Programming");

        Student student = new Student("Alice");
        student.addGrade("Java", 95);

        System.out.println("Student: " + student.getName());
        System.out.println("Grade in Java: " + student.getGrade("Java"));

        // Fetching the course content
        /* read */ String content = course.getContent(1);
        System.out.println("Week 1 Content: " + content);

        content = course.getContent(2);
        System.out.println("Week 2 Content: " + content);
    }
}