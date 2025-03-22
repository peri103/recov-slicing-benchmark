public class Main {
    public static void main(String[] args) {
        CustomSet customSet = new CustomSet();
        customSet.addValue(42);

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ boolean containsValue = customSet.containsValue(42);
        System.out.println("CustomSet contains 42: " + containsValue);
    }
}