import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        VectorOperations operations = new VectorOperations();
        operations.initializeVector(data);
        
        VectorAnalyzer analyzer = new VectorAnalyzer();
        
        /* read */ ArrayRealVector readVector = operations.getVector();
        
        analyzer.setVector(readVector);
        
        double sum = analyzer.calculateSum();
        System.out.println("Sum of vector elements: " + sum);
        
        double norm = operations.calculateNorm();
        System.out.println("Norm of the vector: " + norm);
        
        RealVector scaledVector = operations.scaleVector(2.0);
        double dotProduct = analyzer.calculateDotProduct(scaledVector);
        System.out.println("Dot product of original and scaled vector: " + dotProduct);
    }
}