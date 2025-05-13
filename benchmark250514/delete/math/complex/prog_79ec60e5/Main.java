import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a matrix with one column using the column data
        RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        
        // Additional matrix operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = additionalMatrix.transpose();
        RealMatrix multipliedMatrix = transposedMatrix.multiply(additionalMatrix);
        
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Using the original matrix to read the column vector
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        System.out.println("Written Vector: " + columnVector);
        System.out.println("Read Vector: " + readVector);
        
        // More operations with vectors
        RealVector scaledVector = columnVector.mapMultiply(2.0);
        RealVector addedVector = scaledVector.add(readVector);
        
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);
    }
}