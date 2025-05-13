import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxisHandler logAxisHandler = new LogarithmicAxisHandler("Example Axis");
        ComplexCalculator calculator = new ComplexCalculator();

        // Set the base using LogarithmicAxisHandler
        logAxisHandler.setBase(10.0);

        NumberAxis numberAxis = new NumberAxis("Number Axis");
        numberAxis.setRange(1, 100);
        double lowerBound = numberAxis.getLowerBound();
        double upperBound = numberAxis.getUpperBound();

        // Calculate the middle value using ComplexCalculator
        double middleValue = calculator.calculateAverage(lowerBound, upperBound);
        System.out.println("Middle value of NumberAxis range: " + middleValue);

        // Retrieve the base value using LogarithmicAxisHandler
        /* read */ double baseValue = logAxisHandler.getBase();
        System.out.println("LogarithmicAxis base value: " + baseValue);

        // Perform a power calculation using ComplexCalculator
        double result = calculator.calculatePower(baseValue, middleValue);
        System.out.println("Result of power calculation: " + result);
    }
}