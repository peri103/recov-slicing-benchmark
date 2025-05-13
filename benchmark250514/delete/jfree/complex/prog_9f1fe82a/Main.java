import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot and set a label generator
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(labelGenerator);

        // Create a pie dataset and add some data
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 43.2);
        dataset.setValue("Category B", 27.9);
        dataset.setValue("Category C", 79.5);

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart(
            "Sample Pie Chart",
            dataset,
            true,
            true,
            false
        );

        // Add the plot to the chart
        chart.setPlot(plot);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the label generator from the plot
        /* read */ PieSectionLabelGenerator readLabelGenerator = plot.getLabelGenerator();
        
        // Print the label generator to verify
        System.out.println(readLabelGenerator);

        // Additional unrelated code
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}