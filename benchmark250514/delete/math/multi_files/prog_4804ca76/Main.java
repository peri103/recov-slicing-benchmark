import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        
        // Data for symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        // Create symmetric matrix
        matrixOps.createSymmetricMatrix(data);
        
        // Create another matrix for operations
        double[][] additionalData = {
            {4, 5, 6},
            {5, 8, 9},
            {6, 9, 12}
        };
        RealMatrix additionalMatrix = MatrixUtils.createSymmetricMatrix(additionalData);
        
        // Perform matrix addition
        RealMatrix sumMatrix = matrixOps.addMatrices(additionalMatrix);
        System.out.println("Sum matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrixOps.multiplyMatrices(additionalMatrix);
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = matrixOps.getSymmetricMatrix();
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create a student and add grades
        Student student = new Student("Alice");
        student.addGrade(90.0);
        student.addGrade(85.5);
        student.addGrade(78.0);
        
        // Calculate and print the student's average grade
        double average = student.calculateAverage();
        System.out.println("Average grade for " + student.name + ": " + average);
    }
}