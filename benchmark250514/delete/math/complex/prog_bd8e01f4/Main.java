import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using the write method
        /* write */ SparseRealVector sparseVector = (SparseRealVector) MatrixUtils.createSparseRealVector(new double[]{1.0, 2.0, 3.0});

        // Create another vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = sparseVector.add(vector);

        // Create a matrix and perform operations
        RealMatrix matrix = new BlockRealMatrix(3, 3);
        matrix.setRowVector(0, sumVector);
        matrix.setRowVector(1, vector);
        matrix.setRowVector(2, sparseVector);

        // Calculate the product of matrix and vector
        RealVector productVector = matrix.operate(vector);

        // Print the product vector
        System.out.println("Product Vector:");
        for (int i = 0; i < productVector.getDimension(); i++) {
            System.out.println(productVector.getEntry(i));
        }

        // Perform a check and manipulate the vector
        if (sumVector.getEntry(0) > sparseVector.getEntry(0)) {
            sumVector.mapMultiplyToSelf(2.0);
        }

        // Read the sparse real vector using the read method
        /* read */ RealVector readVector = sparseVector;

        // Print the elements of the vector to verify
        System.out.println("Read Sparse Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }

        // Perform some additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector transposedProduct = transposedMatrix.operate(sumVector);

        // Print the transposed product vector
        System.out.println("Transposed Product Vector:");
        for (int i = 0; i < transposedProduct.getDimension(); i++) {
            System.out.println(transposedProduct.getEntry(i));
        }
    }
}