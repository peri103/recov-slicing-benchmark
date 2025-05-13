import org.jfree.chart.title.TextTitle;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a pie chart dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 40);
        dataset.setValue("Category B", 30);
        dataset.setValue("Category C", 30);

        // Create a pie chart
        JFreeChart chart = ChartFactory.createPieChart(
            "Sample Pie Chart", // chart title
            dataset,            // dataset
            true,               // include legend
            true,
            false
        );

        // Set up a plot and modify its properties
        Plot plot = chart.getPlot();
        if (plot instanceof PiePlot) {
            PiePlot piePlot = (PiePlot) plot;
            piePlot.setSectionOutlinesVisible(false);
            piePlot.setLabelGenerator(null);
        }

        // Create and configure a TextTitle
        TextTitle title = new TextTitle();
        /* write */ title.setText("Hello World");

        // Add the title to the chart
        chart.setTitle(title);

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            dataset.setValue("Category " + (char)('D' + i), i * 10);
        }

        // Modify the plot again
        if (plot instanceof PiePlot) {
            PiePlot piePlot = (PiePlot) plot;
            piePlot.setCircular(true);
            piePlot.setIgnoreZeroValues(true);
        }

        // Retrieve the text from the title
        /* read */ String text = title.getText();
        System.out.println(text);

        // Print the chart title
        System.out.println("Chart Title: " + chart.getTitle().getText());
    }
}