import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});
        
        // Additional RealMatrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(identityMatrix);
        
        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Additional RealVector operations
        RealVector vectorAdd = columnVector.mapAdd(5.0);
        
        // Print the modified vector
        System.out.println("Modified Vector:");
        for (int i = 0; i < vectorAdd.getDimension(); i++) {
            System.out.println(vectorAdd.getEntry(i));
        }
        
        /* write */ matrix.setColumnVector(0, columnVector);
        
        // Perform some unrelated calculations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = transposedMatrix.multiply(matrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
        
        // Additional operations with another matrix
        double[][] anotherMatrixData = {
            {2.0, 4.0, 6.0},
            {8.0, 10.0, 12.0},
            {14.0, 16.0, 18.0}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix resultMatrix = anotherMatrix.scalarMultiply(0.5);
        
        // Print the result of scalar multiplication
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}