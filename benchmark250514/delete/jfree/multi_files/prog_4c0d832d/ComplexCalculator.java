public class ComplexCalculator {
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double calculateAverage(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}