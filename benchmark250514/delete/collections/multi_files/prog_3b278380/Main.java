public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.enroll("Computer Science");
        System.out.println("Enrolled in: " + student.getCourseName());

        student.addGrade("Mathematics", 95);
        student.addGrade("Science", 88);

        int mathGrade = student.getGrade("Mathematics");
        System.out.println("Grade in Mathematics: " + mathGrade);

        int scienceGrade = student.getGrade("Science");
        System.out.println("Grade in Science: " + scienceGrade);
    }
}