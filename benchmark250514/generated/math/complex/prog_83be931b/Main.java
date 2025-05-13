import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix with one row of data
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform some unrelated operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the vector operation
        System.out.println("Resultant vector after operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More unrelated operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Matrix after adding identity matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Extract the row real matrix from the created matrix
        /* read */ RealMatrix extractedMatrix = matrix.getRowMatrix(0);

        // Print the extracted matrix data
        System.out.println("Extracted matrix data:");
        for (int i = 0; i < extractedMatrix.getColumnDimension(); i++) {
            System.out.print(extractedMatrix.getEntry(0, i) + " ");
        }
    }
}