public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.addGrade("Math", 95);
        student.addGrade("Science", 88);

        Course course = new Course("Computer Science");
        course.enrollStudent(student);

        System.out.println(course);

        /* read */ Integer mathGrade = student.getGrade("Math");
        System.out.println("Math Grade: " + mathGrade);
    }
}