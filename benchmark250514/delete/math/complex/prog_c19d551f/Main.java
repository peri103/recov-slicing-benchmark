import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};

        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);

        // Additional operations
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        LUDecomposition decomposition = new LUDecomposition(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector constants = MatrixUtils.createArrayRealVector(new double[]{5.0, 6.0});
        RealVector solution = solver.solve(constants);

        // Perform some calculations
        double sum = 0;
        for (int i = 0; i < solution.getDimension(); i++) {
            sum += solution.getEntry(i);
        }
        System.out.println("Sum of solution vector: " + sum);

        // More complex operations
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector additionalVector = MatrixUtils.createArrayRealVector(additionalData);
        RealVector combinedVector = vector.add(additionalVector);

        System.out.println("Combined Vector: " + combinedVector);

        /* read */ RealVector readVector = MatrixUtils.getArrayRealVector(vector.toArray());
        
        System.out.println("Read Vector: " + readVector);

        // Further manipulations
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}