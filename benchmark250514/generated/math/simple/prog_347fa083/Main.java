import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        ArrayRealVector vector = new ArrayRealVector(1);
        /* write */ vector.setEntry(0, 2.5);
        /* read */ double value = vector.getEntry(0);
        System.out.println(value);
    }
}