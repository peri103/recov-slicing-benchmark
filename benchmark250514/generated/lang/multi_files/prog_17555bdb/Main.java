public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        Course course = new Course("Math 101");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        student1.setPerformanceScore(95.5f);
        student2.setPerformanceScore(88.0f);

        course.displayStudents();

        /* read */ float johnScore = student1.getPerformanceScore();
        System.out.println("John's performance score: " + johnScore);
    }
}