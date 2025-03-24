public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addData(1);
        /* read */ boolean contains = student.checkData(1);
        System.out.println("Data contains 1: " + contains);
    }
}