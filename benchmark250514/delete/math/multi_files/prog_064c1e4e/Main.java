public class Main {
    public static void main(String[] args) {
        DiagonalMatrixWrapper matrixWrapper = new DiagonalMatrixWrapper(3);
        
        // Set a diagonal entry
        matrixWrapper.setDiagonalEntry(1, 5.0);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        course.addStudent(student1);
        course.addStudent(student2);

        // Perform operations with the course
        for (Student student : course.getStudents()) {
            System.out.println("Student in course: " + student.getName());
        }

        // Retrieve and print the diagonal entry
        /* read */ double value = matrixWrapper.getDiagonalEntry(1);
        System.out.println("Diagonal Matrix Value: " + value);
    }
}