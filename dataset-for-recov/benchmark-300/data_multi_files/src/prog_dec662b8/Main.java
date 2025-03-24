public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.storeScore("Math", 95);
        student2.storeScore("Math", 85);

        for (Student student : course.getStudents()) {
            /* read */ Integer score = student.getScore("Math");
            System.out.println(student + " scored " + score + " in Math");
        }
    }
}