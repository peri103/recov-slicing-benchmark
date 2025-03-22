public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        dequeOps.addValue(42);
        dequeOps.addValue(100);
        dequeOps.addValue(200);

        Course javaCourse = new Course("Java Programming");
        Student student1 = new Student("Alice");
        student1.addGrade(85);
        student1.addGrade(90);
        javaCourse.addStudent(student1);

        Student student2 = new Student("Bob");
        student2.addGrade(78);
        student2.addGrade(82);
        javaCourse.addStudent(student2);

        System.out.println("Course: " + javaCourse.getCourseName());
        for (Student student : javaCourse.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        try {
            int lastDequeValue = dequeOps.retrieveLastValue();
            System.out.println("Last deque value: " + lastDequeValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}