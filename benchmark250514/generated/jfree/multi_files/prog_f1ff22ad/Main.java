public class Main {
    public static void main(String[] args) {
        // Create a ChartInfo object
        ChartInfo chartInfo = new ChartInfo();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Enable mouse wheel
        chartInfo.enableMouseWheel();

        // More unrelated operations
        double product = 1.0;
        for (double i = 1.0; i <= 5.0; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Check if mouse wheel is enabled
        boolean isMouseWheelEnabled = chartInfo.isMouseWheelEnabled();

        // Print the result
        System.out.println("Is mouse wheel enabled: " + isMouseWheelEnabled);

        // Additional unrelated operations
        StringBuilder builder = new StringBuilder();
        builder.append("Complexity");
        builder.append(" in code");
        System.out.println(builder.toString());
    }
}