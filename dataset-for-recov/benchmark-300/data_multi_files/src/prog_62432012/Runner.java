public class Runner {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addGrade(42);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        boolean hasGrade = GradeChecker.checkGrade(student.getGrades(), 42);
        System.out.println("Student " + student.getName() + " has grade 42: " + hasGrade);
    }
}