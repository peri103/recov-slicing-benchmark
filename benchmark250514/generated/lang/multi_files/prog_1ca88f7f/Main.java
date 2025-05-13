public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add grades to students
        student1.addGrade(85);
        student2.addGrade(90);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Create a mutable number instance
        MutableNumber number = new MutableNumber();
        
        // Perform write operation
        number.setNumber(42);

        // Complex logic
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s grades: " + student.getGrades());
        }

        // Perform read operation
        /* read */ int finalValue = number.getNumber();
        System.out.println("Final Value: " + finalValue);
    }
}