public class Main {
    public static void main(String[] args) {
        ZipEntryManager zipManager = new ZipEntryManager();
        zipManager.addEntry("example.txt", 1024);

        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        course.addStudent(alice);
        course.addStudent(bob);

        course.printStudentNames();
        zipManager.printAllEntries();

        /* read */ long size = zipManager.getEntrySize("example.txt");
        System.out.println("Size of 'example.txt': " + size);
    }
}