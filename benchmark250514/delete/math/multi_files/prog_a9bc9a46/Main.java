import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] initialData = {{1.0, 2.0, 3.0}};
        
        VectorManager vectorManager = new VectorManager(initialData);
        vectorManager.updateRowVector(0, new double[]{4.0, 5.0, 6.0});
        
        VectorAnalyzer vectorAnalyzer = new VectorAnalyzer();
        RealVector analyzedVector = vectorAnalyzer.analyzeRowVector(vectorManager.getMatrix(), 0);
        
        System.out.println("Analyzed Vector: " + analyzedVector);
    }
}