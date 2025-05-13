import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class ComplexCalculations {
    private RealMatrix matrix;

    public ComplexCalculations(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector performVectorOperations(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        return resultVector;
    }
}
