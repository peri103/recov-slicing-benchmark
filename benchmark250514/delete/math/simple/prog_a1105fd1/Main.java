import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] matrixData = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(matrixData);

        /* read */ double value = symmetricMatrix.getEntry(0, 0);

        System.out.println(value);
    }
}