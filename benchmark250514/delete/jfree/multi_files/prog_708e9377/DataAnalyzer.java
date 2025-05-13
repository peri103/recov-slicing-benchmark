public class DataAnalyzer {
    private double[] data;

    public DataAnalyzer(double[] data) {
        this.data = data;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }
}
