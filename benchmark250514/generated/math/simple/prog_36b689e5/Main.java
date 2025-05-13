import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix with 3 rows and 3 columns, filled with zeros
        RealMatrix sparseMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value into the sparse matrix
        /* write */ sparseMatrix.setEntry(0, 0, 1.0);

        // Read the value from the sparse matrix
        /* read */ double value = sparseMatrix.getEntry(0, 0);

        System.out.println(value);
    }
}