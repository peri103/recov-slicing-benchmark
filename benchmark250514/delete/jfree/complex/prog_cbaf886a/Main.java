import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MultiplePiePlot
        MultiplePiePlot plot = new MultiplePiePlot();

        // Create a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 10);
        dataset.setValue("Category 2", 20);

        // Set the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // Create a different chart for unrelated complexity
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row1", "Column1");
        categoryDataset.addValue(5.0, "Row1", "Column2");
        categoryDataset.addValue(3.0, "Row1", "Column3");

        JFreeChart barChart = ChartFactory.createBarChart(
            "Bar Chart Example",
            "Category",
            "Score",
            categoryDataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        // Perform some operations on the bar chart
        System.out.println("Bar Chart Title: " + barChart.getTitle().getText());

        // More operations on the original plot
        plot.setAggregatedItemsKey("Aggregated Items");
        plot.setLimit(0.1);

        // Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Print the retrieved dataset to verify
        System.out.println("Retrieved Dataset: " + retrievedDataset);
    }
}