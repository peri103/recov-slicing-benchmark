public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        course.addTopic(1, "Introduction to Java");
        course.addTopic(2, "Object-Oriented Programming");

        Student student = new Student("Alice", course);

        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + student.getCourse().getCourseName());
        
        // Reading topic for week 1
        String topicWeek1 = student.getCourse().getTopic(1);
        System.out.println("Week 1 Topic: " + topicWeek1);

        // Reading topic for week 2
        String topicWeek2 = student.getCourse().getTopic(2);
        System.out.println("Week 2 Topic: " + topicWeek2);
    }
}