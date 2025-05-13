public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        InstanceManager instanceManager = new InstanceManager();
        instanceManager.storeInstance(Course.class, course);

        // Perform some operations
        for (Student student : course.getStudents()) {
            System.out.println("Enrolled student: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve and use stored instance
        Course retrievedCourse = instanceManager.retrieveInstance(Course.class);
        System.out.println("Retrieved course: " + retrievedCourse.getStudents().size() + " students enrolled.");

        // Additional operations
        if (retrievedCourse.getStudents().size() > 1) {
            System.out.println("There are multiple students in the course.");
        } else {
            System.out.println("There is only one student in the course.");
        }
    }
}