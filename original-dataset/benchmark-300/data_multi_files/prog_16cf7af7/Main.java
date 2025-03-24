public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        student1.storeGrade("Math", 95);
        student2.storeGrade("Math", 85);

        for (Student student : mathCourse.getStudents()) {
            /* read */ Integer grade = student.getGrade("Math");
            System.out.println(student.getName() + "'s grade in Math: " + grade);
        }
    }
}