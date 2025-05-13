public class Main {
    public static void main(String[] args) {
        // Create a JarHandler instance and set extra data
        JarHandler jarHandler = new JarHandler("example.jar");
        byte[] extraData = {1, 2, 3, 4};
        jarHandler.setExtraData(extraData);
        
        // Create students and a course
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        
        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        // Retrieve and display enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getStudentID());
        }
        
        // Retrieve and display extra data from the jar
        /* read */ byte[] readData = jarHandler.getExtraData();
        System.out.print("Extra Data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}