import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Create a new matrix with the vector data
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
            vector.toArray(),
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        /* read */ RealVector readVector = MatrixUtils.getArrayRealVector(vector.toArray());
        
        // Print the read vector
        System.out.println("Read Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}