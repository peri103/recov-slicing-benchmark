public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        SparseVectorOperations operations = new SparseVectorOperations(data);
        VectorAnalysis analysis = new VectorAnalysis(operations);

        SparseRealVector analyzedVector = analysis.analyzeVector();
        System.out.println("Analyzed vector: " + analyzedVector);

        double sum = analysis.computeSum();
        System.out.println("Sum of vector entries: " + sum);

        SparseRealVector scaledVector = operations.scaleVector(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}