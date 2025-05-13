public class Main {
    public static void main(String[] args) {
        CpioEntryHandler handler = new CpioEntryHandler("testfile.txt");
        handler.setMode(0755);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }

        /* read */ int mode = handler.getMode();
        System.out.println("Unix Mode of entry: " + mode);
    }
}