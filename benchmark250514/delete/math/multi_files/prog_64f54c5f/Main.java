import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create matrix operations instance
        MatrixOperations matrixOps = new MatrixOperations();

        // Create a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        matrixOps.createMatrix(data);

        // Create a course and add students
        Course course = new Course("Math");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getTitle());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read the symmetric matrix using the read method
        /* read */ RealMatrix readMatrix = matrixOps.getMatrix();

        // Print the read matrix to verify
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}