import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot
        CategoryPlot plot = new CategoryPlot();

        // Create and set a DomainAxis
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        /* write */ plot.setDomainAxis(domainAxis);

        // Create and set a RangeAxis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        plot.setRangeAxis(rangeAxis);

        // Create and set a Renderer
        BarRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);

        // Create a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create a chart with the plot and dataset
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart",
            "Category",
            "Value",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        // Additional operations
        System.out.println("Chart Title: " + chart.getTitle().getText());
        System.out.println("Dataset Row Count: " + dataset.getRowCount());

        // Retrieve the DomainAxis
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());

        // Perform some operations with the retrieved axis
        retrievedAxis.setTickLabelsVisible(false);
        System.out.println("Tick Labels Visible: " + retrievedAxis.isTickLabelsVisible());
    }
}