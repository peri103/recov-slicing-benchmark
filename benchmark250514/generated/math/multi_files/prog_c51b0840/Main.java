import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};

        // Use MatrixHandler to create and manage matrix
        MatrixHandler handler = new MatrixHandler();
        handler.createMatrix(rowData);

        // Perform vector operations
        MatrixOperations.performVectorOperations(rowData);

        // Perform matrix operations
        MatrixOperations.performMatrixOperations(handler);

        // Read the matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = handler.getMatrix();

        // Print the read matrix to verify the value
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}