import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] matrixData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a column vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Perform some unrelated operations
        double[][] anotherMatrixData = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(anotherMatrixData);
        
        RealVector vectorSum = columnVector.add(columnVector);
        System.out.println("Vector Sum:");
        for (int i = 0; i < vectorSum.getDimension(); i++) {
            System.out.println(vectorSum.getEntry(i));
        }
        
        double[][] resultMatrixData = new double[anotherMatrix.getRowDimension()][anotherMatrix.getColumnDimension()];
        for (int i = 0; i < anotherMatrix.getRowDimension(); i++) {
            for (int j = 0; j < anotherMatrix.getColumnDimension(); j++) {
                resultMatrixData[i][j] = anotherMatrix.getEntry(i, j) * 2;
            }
        }
        
        RealMatrix resultMatrix = MatrixUtils.createRealMatrix(resultMatrixData);
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);
        
        // More unrelated operations
        RealVector scaledVector = columnVector.mapMultiply(3.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        // Read the column vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        // Print the values of the read column vector
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}