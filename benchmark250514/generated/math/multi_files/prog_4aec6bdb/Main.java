import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a column array
        double[] columnData = {1.0, 2.0, 3.0};

        // Create and use MatrixOperations to create a column matrix
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createColumnMatrix(columnData);

        // Initialize a 2D array for another matrix
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };

        // Create and use ComplexMatrixOperations to perform operations
        ComplexMatrixOperations complexOps = new ComplexMatrixOperations(matrixData);
        RealMatrix sumMatrix = complexOps.addMatrix(matrixOps.getColumnMatrix());

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrixOps.getColumnMatrix();

        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }

        // Perform and print matrix multiplication
        RealMatrix productMatrix = complexOps.multiplyByTranspose();
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}