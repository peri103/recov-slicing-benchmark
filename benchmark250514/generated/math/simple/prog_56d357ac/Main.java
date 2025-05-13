import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        /* write */ matrix.setEntry(1, 1, 5.0);
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println(value);
    }
}