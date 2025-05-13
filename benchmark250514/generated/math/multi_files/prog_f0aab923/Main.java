public class Main {
    public static void main(String[] args) {
        MatrixOperations operations = new MatrixOperations(3, 3);
        operations.setMatrixEntry(0, 0, 5.0);
        operations.setMatrixEntry(1, 1, 10.0);
        operations.setMatrixEntry(2, 2, 15.0);

        MatrixAnalyzer analyzer = new MatrixAnalyzer(operations.getMatrix());

        double trace = analyzer.calculateTrace();
        System.out.println("Trace of the matrix: " + trace);

        double value = analyzer.getEntry(0, 0);
        System.out.println("Value at (0,0): " + value);
    }
}