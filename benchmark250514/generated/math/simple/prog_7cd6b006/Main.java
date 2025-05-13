import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        /* write */ matrix.setEntry(0, 0, 2.5);
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println(value);
    }
}