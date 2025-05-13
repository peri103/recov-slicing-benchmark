import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(additionalData);
        RealVector resultVector = vector.mapAdd(2.0);
        
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Create a new matrix and perform operations
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(additionalData);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated arithmetic operations
        int a = 5;
        int b = 10;
        int c = a * b;
        System.out.println("Multiplication result: " + c);
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getDataRef(), 0);
        
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}