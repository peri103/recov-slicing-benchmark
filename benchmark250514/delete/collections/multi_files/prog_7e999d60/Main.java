public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        student1.enroll("Mathematics");
        student2.enroll("Science");

        student1.setGrade("Mathematics", "A");
        student2.setGrade("Science", "B");

        System.out.println(student1.getName() + " enrolled in " + student1.getCourseName());
        System.out.println(student2.getName() + " enrolled in " + student2.getCourseName());

        String grade1 = student1.getGrade("Mathematics");
        String grade2 = student2.getGrade("Science");

        System.out.println(student1.getName() + " received grade: " + grade1);
        System.out.println(student2.getName() + " received grade: " + grade2);
    }
}