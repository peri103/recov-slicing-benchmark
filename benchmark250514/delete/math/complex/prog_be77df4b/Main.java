import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        // Additional matrix operations
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(matrixData);
        
        RealVector columnVector = new ArrayRealVector(new double[]{10.0, 11.0});
        RealMatrix modifiedMatrix = additionalMatrix.add(columnVector.outerProduct(columnVector));
        
        System.out.println("Modified Matrix: ");
        for (int i = 0; i < modifiedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < modifiedMatrix.getColumnDimension(); j++) {
                System.out.print(modifiedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // More operations
        RealMatrix multipliedMatrix = matrix.multiply(modifiedMatrix);
        
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        System.out.println("Retrieved Matrix Row: ");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}