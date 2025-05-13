public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        student1.addScore("Math", 85);
        student2.addScore("Math", 90);

        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ Integer score = student.getScore("Math");
            System.out.println("Math Score: " + score);
        }
    }
}