public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addData("Hello");
        /* read */ boolean contains = student.containsData("Hello");
        System.out.println("Contains 'Hello': " + contains);
    }
}