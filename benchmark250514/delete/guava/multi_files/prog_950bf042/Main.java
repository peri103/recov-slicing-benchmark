public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollInCourse("Mathematics");
        student.addGrade("Math", 95);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Course: " + student.getCourseName());
        int mathGrade = student.getGrade("Math");
        System.out.println("Math Grade: " + mathGrade);
    }
}