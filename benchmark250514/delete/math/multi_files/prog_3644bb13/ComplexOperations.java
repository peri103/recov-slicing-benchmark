import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class ComplexOperations {
    public RealVector addVectors(OpenMapRealVector vector1, double[] data) {
        RealVector anotherVector = MatrixUtils.createRealVector(data);
        return vector1.add(anotherVector);
    }

    public int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
