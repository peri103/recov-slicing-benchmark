import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        /* write */ matrix.setEntry(1, 5.0);
        /* read */ double value = matrix.getEntry(1);
        System.out.println(value);
    }
}