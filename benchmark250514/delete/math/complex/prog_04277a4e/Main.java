import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix and perform some operations
        double[][] otherData = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(otherData);
        
        // Add the two matrices
        RealMatrix sumMatrix = matrix.add(otherMatrix);
        System.out.println("Sum Matrix:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Create a vector and perform multiplication
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Some unrelated operations
        double[][] unrelatedData = {{9.0, 10.0}, {11.0, 12.0}};
        RealMatrix unrelatedMatrix = MatrixUtils.createRealMatrix(unrelatedData);
        RealMatrix productMatrix = unrelatedMatrix.multiply(otherMatrix);
        
        System.out.println("Product Matrix:");
        for (int row = 0; row < productMatrix.getRowDimension(); row++) {
            for (int col = 0; col < productMatrix.getColumnDimension(); col++) {
                System.out.print(productMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getRealMatrix(matrix.getData());
        
        System.out.println("Read Matrix:");
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}