public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("John Doe", course);

        student.enrollInCourse("course1", 95);

        Integer score = student.getScore("John Doe");
        System.out.println("Score for John Doe in course1: " + score);

        // Additional complexity with another student
        Student student2 = new Student("Jane Doe", course);
        student2.enrollInCourse("course1", 88);
        Integer score2 = student2.getScore("Jane Doe");
        System.out.println("Score for Jane Doe in course1: " + score2);
    }
}