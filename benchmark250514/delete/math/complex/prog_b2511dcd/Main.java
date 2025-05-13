import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        // Additional Matrix Operations
        RealMatrix matrixA = MatrixUtils.createRealMatrix(data);
        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix resultMatrix = matrixA.multiply(matrixB);
        
        // Vector Operations
        RealVector vectorA = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector vectorB = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector resultVector = vectorA.add(vectorB);
        
        // Print the result of matrix multiplication
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Print the result of vector addition
        System.out.println("Vector Addition Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // More operations to increase complexity
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);
        
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = matrix.getSubMatrix(0, 1, 0, 1);
        
        System.out.println("Read Block Real Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}