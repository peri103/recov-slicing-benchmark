public class Main {
    public static void main(String[] args) {
        ArchiveEntryHandler handler = new ArchiveEntryHandler();
        handler.setUserName("JohnDoe");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ String userName = handler.getUserName();
        System.out.println("Archive Entry User Name: " + userName);
    }
}