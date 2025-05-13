import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Additional matrix operations
        double[] columnData = {4.0, 5.0, 6.0};
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        RealMatrix productMatrix = matrix.multiply(columnMatrix);
        
        // Vector operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapAdd(10.0);
        
        // More complex operations
        double[] anotherRowData = {10.0, 11.0, 12.0};
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRowData);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Print results of vector operations
        System.out.println("Resulting vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Print results of matrix multiplication
        System.out.println("Product matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Sum matrix operations
        System.out.println("Sum matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        double[] readData = readMatrix.getRow(0);
        System.out.println("Read data:");
        for (double value : readData) {
            System.out.print(value + " ");
        }
    }
}