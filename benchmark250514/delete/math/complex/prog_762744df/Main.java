import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] additionalRowData = {4.0, 5.0, 6.0};
        
        // Create a row matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform some operations on the matrix
        RealMatrix additionalMatrix = MatrixUtils.createRowRealMatrix(additionalRowData);
        RealMatrix combinedMatrix = matrix.add(additionalMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapMultiply(2.0);
        
        // Print the vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Calculate the determinant of the combined matrix
        double determinant = combinedMatrix.getDeterminant();
        System.out.println("Determinant of combined matrix: " + determinant);

        // Retrieve the original row matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
        
        // Additional operations
        RealMatrix transposedMatrix = combinedMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}