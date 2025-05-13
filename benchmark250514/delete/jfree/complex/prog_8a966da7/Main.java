import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Initial Plot setup
        Plot plot = new Plot() {
            private Dataset dataset;

            @Override
            public void setDataset(Dataset dataset) {
                this.dataset = dataset;
            }

            @Override
            public Dataset getDataset() {
                return this.dataset;
            }
        };

        // Create a DefaultPieDataset
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category 1", 43.2);
        pieDataset.setValue("Category 2", 27.9);
        pieDataset.setValue("Category 3", 79.5);

        // Create a DefaultCategoryDataset
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row 1", "Column 1");
        categoryDataset.addValue(5.0, "Row 1", "Column 2");
        categoryDataset.addValue(3.0, "Row 1", "Column 3");

        // Create a PiePlot
        PiePlot piePlot = new PiePlot(pieDataset);

        // Create a CategoryPlot
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setDataset(categoryDataset);

        // Create a JFreeChart
        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart Example", pieDataset, true, true, false);
        JFreeChart categoryChart = ChartFactory.createBarChart("Bar Chart Example", "Category", "Value", categoryDataset);

        // Write the dataset to the plot
        /* write */ plot.setDataset(pieDataset);

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the dataset from the plot
        /* read */ Dataset readDataset = plot.getDataset();

        // Print the read dataset
        System.out.println("Read Dataset: " + readDataset);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing item: " + i);
        }

        // Display some information about the charts
        System.out.println("Pie Chart Title: " + pieChart.getTitle().getText());
        System.out.println("Category Chart Title: " + categoryChart.getTitle().getText());
    }
}