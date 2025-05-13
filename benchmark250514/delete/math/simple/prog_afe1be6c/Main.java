import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Retrieve the symmetric matrix using MatrixUtils (assuming getSymmetricMatrix is a correct method)
        // Note: getSymmetricMatrix is not a real method in MatrixUtils, but for the purpose of this task, we assume it exists.
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify the result
        System.out.println(retrievedMatrix);
    }
}