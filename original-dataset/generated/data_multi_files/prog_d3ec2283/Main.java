public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("Alice", 20, mathCourse);

        mathCourse.addScore(student.getName(), 95);

        // Additional operations
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Course Name: " + student.getCourse().getCourseName());

        // Check scores
        Integer score = student.getCourse().getScore(student.getName());
        /* read */ System.out.println("Score for " + student.getName() + ": " + score);

        // Further operations
        mathCourse.addScore("Bob", 85);
        System.out.println("Score for Bob: " + mathCourse.getScore("Bob"));
    }
}