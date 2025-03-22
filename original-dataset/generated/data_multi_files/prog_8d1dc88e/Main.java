public class Main {
    public static void main(String[] args) {
        PriorityQueueHandler queueHandler = new PriorityQueueHandler();
        queueHandler.addNumber(42);
        queueHandler.addNumber(15);
        queueHandler.addNumber(30);

        Student student1 = new Student("Alice");
        student1.addGrade("Math", 85);
        student1.addGrade("Science", 90);

        Student student2 = new Student("Bob");
        student2.addGrade("Math", 78);
        student2.addGrade("Science", 88);

        Course mathCourse = new Course("Math");
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        mathCourse.listStudents();

        student1.printGrades();
        student2.printGrades();

        /* read */ Integer value = queueHandler.retrieveNumber();
        System.out.println("Retrieved from priority queue: " + value);
    }
}