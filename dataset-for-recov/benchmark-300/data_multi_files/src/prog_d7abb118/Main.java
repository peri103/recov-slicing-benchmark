public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.storeData("example");
        /* read */ boolean contains = student.checkData("example");
        System.out.println("Does the student's data storage contain 'example'? " + contains);
    }
}