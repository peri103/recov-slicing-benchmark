public class Main {
    public static void main(String[] args) {
        StackOperations stackOps = new StackOperations();
        stackOps.pushValue(42);

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }

        // Simulate some operations on the stack
        stackOps.pushValue(100);
        stackOps.pushValue(200);

        int sum = 0;
        while (!stackOps.isEmpty()) {
            sum += stackOps.popValue();
        }
        System.out.println("Sum of stack values: " + sum);

        // Finally read the value
        stackOps.pushValue(300);
        /* read */ int value = stackOps.popValue();
        System.out.println("Popped value: " + value);
    }
}