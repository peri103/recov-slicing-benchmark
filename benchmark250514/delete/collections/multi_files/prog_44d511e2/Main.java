public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        student1.addScore("Math", 95);
        student2.addScore("Math", 88);

        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ Collection<Integer> scores = student.getScores("Math");
            for (Integer score : scores) {
                System.out.println("Score in Math: " + score);
            }
        }
    }
}