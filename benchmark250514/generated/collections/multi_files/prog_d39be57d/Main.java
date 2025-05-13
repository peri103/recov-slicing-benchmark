public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 20);
        student.enrollInCourse("Mathematics");
        student.addScore("Algebra", 85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Enrolled Course: " + student.getCourseName());

        int algebraScore = student.getScore("Algebra");
        System.out.println("Algebra Score: " + algebraScore);
    }
}