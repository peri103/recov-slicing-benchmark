public class Main {
    public static void main(String[] args) {
        // Initialize color configuration
        ColorConfiguration config = new ColorConfiguration();
        config.printConfigurations();

        // Initialize chart renderer and configure it
        ChartRenderer chartRenderer = new ChartRenderer();
        chartRenderer.configurePositivePaint(config.getColor("positive"));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        // Retrieve and print the positive paint to verify
        /* read */ Paint positivePaint = chartRenderer.getPositivePaint();
        System.out.println("Positive paint is set to: " + positivePaint);
    }
}