public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.addItemToBag("apple");
        student2.addItemToBag("banana");

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ int count = student.getItemCountFromBag("apple");
            System.out.println("Apple count: " + count);
        }
    }
}