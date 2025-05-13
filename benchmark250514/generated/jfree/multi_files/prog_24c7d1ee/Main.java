public class Main {
    public static void main(String[] args) {
        ChartRenderer renderer = new ChartRenderer();
        DataProcessor processor = new DataProcessor();

        // Configure renderer
        renderer.configureLineVisibility(0, true);

        // Add data and calculate sum
        for (int i = 0; i < 10; i++) {
            processor.addData(i);
        }
        int sum = processor.calculateSum();
        System.out.println("Sum: " + sum);

        // Check visibility of series lines
        /* read */ Boolean isVisible = renderer.isLineVisible(0);
        
        // Print visibility
        System.out.println("Series 0 lines visible: " + isVisible);
    }
}