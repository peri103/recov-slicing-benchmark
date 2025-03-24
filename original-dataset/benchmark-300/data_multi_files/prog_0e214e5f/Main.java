public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.storeScore("Math", 95);
        student.storeScore("Science", 88);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        /* read */ int mathScore = student.getScore("Math");
        System.out.println("Math Score: " + mathScore);

        int scienceScore = student.getScore("Science");
        System.out.println("Science Score: " + scienceScore);
    }
}