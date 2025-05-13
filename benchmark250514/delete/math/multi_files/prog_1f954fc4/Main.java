import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        // Create matrix operations instance
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createTriangularMatrix(data);

        // Perform some operations on the matrix
        double[][] data2 = {
            {7, 8, 9},
            {0, 10, 11},
            {0, 0, 12}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(data2);

        RealMatrix sumMatrix = matrixOps.addMatrices(anotherMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        RealMatrix multipliedMatrix = matrixOps.multiplyMatrices(anotherMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix
        /* read */ RealMatrix readMatrix = matrixOps.getTriangularMatrix();

        // Print the read matrix to ensure it matches the written matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Math");
        Course science = new Course("Science");

        math.enrollStudent(alice);
        science.enrollStudent(bob);

        alice.enrollInCourse(math);
        bob.enrollInCourse(science);

        // Print course enrollments
        System.out.println("Math Course Enrollments:");
        for (Student student : math.getEnrolledStudents()) {
            System.out.println(student.getCourses().get(0).getCourseName());
        }

        System.out.println("Science Course Enrollments:");
        for (Student student : science.getEnrolledStudents()) {
            System.out.println(student.getCourses().get(0).getCourseName());
        }
    }
}