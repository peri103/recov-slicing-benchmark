import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};

        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println(value);
    }
}