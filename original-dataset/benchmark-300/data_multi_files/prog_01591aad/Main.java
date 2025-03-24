public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);

        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        student1.storeGrade("Math", 95);
        student2.storeGrade("Math", 88);

        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            /* read */ Integer grade = student.getGrade("Math");
            System.out.println("Math Grade: " + grade);
        }
    }
}