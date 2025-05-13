import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        /* write */ matrix.setEntry(1, 1, 42.0);
        
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println(value);
    }
}