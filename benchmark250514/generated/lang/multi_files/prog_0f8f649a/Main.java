public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.setGrade((byte) 85);
        student2.setGrade((byte) 90);

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
        }

        /* read */ byte aliceGrade = student1.getGrade();
        System.out.println("Alice's Grade: " + aliceGrade);
    }
}