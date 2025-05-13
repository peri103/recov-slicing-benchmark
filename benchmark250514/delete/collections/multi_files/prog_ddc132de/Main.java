public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("John Doe", 20, mathCourse);

        mathCourse.addAssignmentScore("Algebra", 95);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse().getCourseName());

        Integer algebraScore = student.getCourse().getAssignmentScore("Algebra");
        System.out.println("Algebra Score: " + algebraScore);
    }
}