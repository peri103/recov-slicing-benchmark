public class Main {
    public static void main(String[] args) {
        HashCodeManager hashCodeManager = new HashCodeManager();
        hashCodeManager.appendValue(123);

        Student student1 = new Student("Alice");
        student1.addScore(85);
        student1.addScore(90);

        Student student2 = new Student("Bob");
        student2.addScore(75);
        student2.addScore(80);

        Course course = new Course("Math");
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            for (int score : student.getScores()) {
                System.out.println("Score: " + score);
            }
        }

        int finalHashCode = hashCodeManager.getHashCode();
        System.out.println("Final Hash Code: " + finalHashCode);
    }
}