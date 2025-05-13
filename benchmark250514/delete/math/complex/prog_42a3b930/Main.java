import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */
        ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Create and manipulate another vector
        double[] data2 = {4.0, 5.0, 6.0};
        ArrayRealVector vector2 = new ArrayRealVector(data2);
        ArrayRealVector sumVector = vector.add(vector2);
        System.out.println("Sum Vector: " + sumVector);

        // Create and manipulate a matrix
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new BlockRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some operations on the original vector
        double norm = vector.getNorm();
        System.out.println("Norm of the original vector: " + norm);

        /* read */
        ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);
        
        System.out.println("Read Vector: " + readVector);
        
        // Further operations on the read vector
        double[] readVectorData = readVector.toArray();
        for (double val : readVectorData) {
            System.out.println("Value from read vector: " + val);
        }
    }
}