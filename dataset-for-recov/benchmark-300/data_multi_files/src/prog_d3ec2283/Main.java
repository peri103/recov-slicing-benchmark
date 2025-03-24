public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.storeGrade("Math", 95);

        // Perform some unrelated operations
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Retrieve the stored grade
        /* read */ Integer mathGrade = student.getGrade("Math");
        System.out.println("Math Grade: " + mathGrade);
    }
}