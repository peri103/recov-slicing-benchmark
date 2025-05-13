import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] additionalData = {{5.0, 6.0}, {7.0, 8.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector multipliedVector = matrix.operate(vector);
        
        // Perform some operations on the resultMatrix
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the multipliedVector
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();
        
        /* read */ double[][] readData = matrix.getData();
        
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}