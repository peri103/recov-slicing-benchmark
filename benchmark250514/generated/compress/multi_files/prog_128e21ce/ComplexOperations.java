import java.util.Arrays;

public class ComplexOperations {
    public static int calculateSum(byte[] data) {
        int sum = 0;
        for (byte b : data) {
            sum += b;
        }
        return sum;
    }

    public static int calculateProduct(byte[] data) {
        int product = 1;
        for (byte b : data) {
            product *= b;
        }
        return product;
    }

    public static byte[] manipulateData(byte[] data) {
        byte[] manipulatedData = Arrays.copyOf(data, data.length);
        for (int i = 0; i < manipulatedData.length; i++) {
            manipulatedData[i] *= 2;
        }
        return manipulatedData;
    }
}
