public class DataAnalyzer {
    private double[] dataValues;

    public DataAnalyzer(double[] dataValues) {
        this.dataValues = dataValues;
    }

    public double calculateAverage() {
        double total = 0;
        for (double value : dataValues) {
            total += value;
        }
        return total / dataValues.length;
    }
}
