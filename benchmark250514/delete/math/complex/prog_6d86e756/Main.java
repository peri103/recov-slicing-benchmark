import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the sparse vector
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a dense vector for additional operations
        ArrayRealVector denseVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Perform some operations on the dense vector
        denseVector.mapMultiplyToSelf(2.0);
        denseVector.setEntry(0, 10.0);
        
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(data);
        
        // Perform operations on the sparse vector
        sparseVector.mapAddToSelf(1.0);
        sparseVector.setEntry(1, 5.0);
        
        // Combine dense and sparse vectors
        RealVector combinedVector = denseVector.add(sparseVector);
        
        // More operations on the combined vector
        double norm = combinedVector.getNorm();
        System.out.println("Norm of combined vector: " + norm);
        
        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            sum += combinedVector.getEntry(i);
        }
        System.out.println("Sum of combined vector elements: " + sum);
        
        /* read */ RealVector readVector = sparseVector;
        
        // Display the read vector
        System.out.println("Read Vector: " + readVector);
    }
}