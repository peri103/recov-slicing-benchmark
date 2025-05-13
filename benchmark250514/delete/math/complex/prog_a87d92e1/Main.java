import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        double[] vectorValues = {4.0, 5.0, 6.0};
        
        RealVector vector = new ArrayRealVector(vectorValues);
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        
        RealVector resultVector = multipliedMatrix.operate(vector);
        
        double sum = 0.0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        
        System.out.println("Sum of elements in result vector: " + sum);
        
        double[] readDiagonal = matrix.getColumn(0);
        
        /* read */ for (double value : readDiagonal) {
            System.out.println(value);
        }
        
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        RealVector finalVector = addedMatrix.operate(vector);
        
        System.out.println("Final vector after addition:");
        for (int i = 0; i < finalVector.getDimension(); i++) {
            System.out.println(finalVector.getEntry(i));
        }
    }
}