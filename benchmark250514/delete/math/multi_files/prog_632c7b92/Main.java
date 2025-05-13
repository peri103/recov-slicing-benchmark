import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        Student student = new Student("Bob", data);
        double[] scores = {1, 2, 3};
        student.setScores(scores);

        RealMatrix matrix = student.getMatrix();
        MatrixAnalyzer analyzer = new MatrixAnalyzer(matrix);

        RealVector readRowVector = analyzer.getRowVector(0);
        System.out.println("Read Row Vector: " + readRowVector);

        analyzer.printMatrix();
    }
}