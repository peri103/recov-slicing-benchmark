public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course course = new Course();

        course.addStudentGrade(student.getName(), "A");
        
        // Additional logic to simulate complex operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing student data...");
        }
        
        /* read */ Object grade = course.getStudentGrade(student.getName());
        System.out.println("Grade for " + student.getName() + ": " + grade);

        // Additional logic after reading
        for (Map.Entry<Object, Object> entry : course.getAllGrades().entrySet()) {
            System.out.println("Course Entry: Student = " + entry.getKey() + ", Grade = " + entry.getValue());
        }
    }
}