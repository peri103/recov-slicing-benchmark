public class Main {
    public static void main(String[] args) {
        ChartManager chartManager = new ChartManager();
        DataProcessor dataProcessor = new DataProcessor();

        // Adding values
        for (double i = 0.0; i < 20.0; i += 5.0) {
            dataProcessor.addValue(i);
        }

        // Calculating sum and max value
        double sum = dataProcessor.calculateSum();
        double maxValue = dataProcessor.findMaxValue();
        System.out.println("Sum of values: " + sum);
        System.out.println("Max value: " + maxValue);

        // Configuring chart axis
        chartManager.configureAxisTickUnit(5.0);

        // Getting and printing the tick unit size
        /* read */ NumberTickUnit readTickUnit = chartManager.getAxisTickUnit();
        System.out.println("Tick Unit Size: " + readTickUnit.getSize());

        // Printing transformed values
        System.out.println("Transformed Values:");
        for (Double transformedValue : dataProcessor.getTransformedValues()) {
            System.out.println(transformedValue);
        }
    }
}