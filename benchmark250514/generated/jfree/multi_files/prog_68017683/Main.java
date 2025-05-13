import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Create and manage chart
        ChartManager chartManager = new ChartManager();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chartManager.getChart()));
        frame.pack();
        frame.setVisible(true);

        // Create and manipulate LegendItemWrapper
        LegendItemWrapper legendItemWrapper = new LegendItemWrapper("Sample Legend");
        legendItemWrapper.setLineVisible(true);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Check the visibility of the line in the legend
        /* read */ boolean isVisible = legendItemWrapper.isLineVisible();
        System.out.println("Is line visible in legend: " + isVisible);

        // More unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}