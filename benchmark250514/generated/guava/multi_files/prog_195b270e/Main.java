public class Main {
    public static void main(String[] args) {
        RangeMapHandler rangeMapHandler = new RangeMapHandler();
        rangeMapHandler.addRange(1, 10, "Value1");

        // Create students and courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enroll("Mathematics");
        student2.enroll("Science");

        course1.addStudent(student1);
        course2.addStudent(student2);

        // Print enrolled students
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students enrolled in " + course2.getCourseName() + ":");
        for (Student student : course2.getStudents()) {
            System.out.println(student.getName());
        }

        /* read */ String value = rangeMapHandler.getValue(5);
        System.out.println("Read value from rangeMap: " + value);
    }
}