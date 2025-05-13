public class Main {
    public static void main(String[] args) {
        // Use ValueHandler to manage ValueMarker
        ValueHandler valueHandler = new ValueHandler(0.0);
        valueHandler.setMarkerValue(5.0);

        // Use IntervalHandler to manage IntervalMarker
        IntervalHandler intervalHandler = new IntervalHandler(1.0, 10.0);
        System.out.println("Interval Length: " + intervalHandler.calculateIntervalLength());
        System.out.println("Sum of Interval Values: " + intervalHandler.calculateSumOfIntervalValues());

        // Read the value from ValueMarker using ValueHandler
        /* read */ double value = valueHandler.getMarkerValue();
        System.out.println("ValueMarker Value: " + value);

        // Perform additional operations using the value read from ValueMarker
        double adjustedValue = value * 2;
        System.out.println("Adjusted ValueMarker Value: " + adjustedValue);
    }
}