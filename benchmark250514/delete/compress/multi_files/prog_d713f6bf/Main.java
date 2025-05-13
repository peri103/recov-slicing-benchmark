public class Main {
    public static void main(String[] args) {
        ArchiveEntryHandler archiveHandler = new ArchiveEntryHandler("testArchive");
        archiveHandler.setUserName("JohnDoe");

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Java Programming");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        int a = 5;
        int b = 15;
        int result = a * b;
        System.out.println("Multiplication result: " + result);

        String userName = archiveHandler.getEntry().getUserName();
        /* read */ System.out.println("Archive UserName: " + userName);
    }
}