import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis numberAxis = new NumberAxis();

        /* write */ piePlot.setMaximumLabelWidth(0.25);

        // Additional code to make the program more complex
        numberAxis.setRange(0.0, 100.0);
        categoryPlot.setRangeAxis(numberAxis);

        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }
        double average = sum / data.length;
        System.out.println("Average: " + average);

        categoryPlot.setDataset(null);
        categoryPlot.setDomainAxis(null);

        // More unrelated operations
        int[] values = {10, 20, 30, 40, 50};
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Max value: " + maxValue);

        /* read */ double maxLabelWidth = piePlot.getMaximumLabelWidth();
        System.out.println("Maximum Label Width: " + maxLabelWidth);

        // Final operations
        categoryPlot.setDomainAxisLocation(null);
        categoryPlot.setRangeGridlinePaint(null);
    }
}