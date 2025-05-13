import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;

public class Main {
    public static void main(String[] args) {
        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(4.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create a bar chart
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart Example",
                "Category",
                "Value",
                dataset);

        // Create a line chart
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Line Chart Example",
                "Category",
                "Value",
                dataset);

        // Create a CategoryPlot and set the renderer
        CategoryPlot plot = new CategoryPlot();
        BarRenderer barRenderer = new BarRenderer();
        plot.setRenderer(barRenderer);

        // Set a range axis using the write method
        ValueAxis axis = new NumberAxis("Range Axis");
        /* write */ plot.setRangeAxis(axis);

        // Perform some unrelated operations
        LineRenderer3D lineRenderer3D = new LineRenderer3D();
        plot.setRenderer(lineRenderer3D);
        
        // Create another plot for complexity
        CategoryPlot plot2 = new CategoryPlot();
        plot2.setDataset(dataset);
        plot2.setRenderer(new BarRenderer());
        
        // Read the range axis using the read method
        /* read */ ValueAxis readAxis = plot.getRangeAxis();
        
        // Output the label of the range axis
        System.out.println("Range Axis: " + readAxis.getLabel());

        // Perform more unrelated operations
        ValueAxis axis2 = new NumberAxis("Secondary Axis");
        plot2.setRangeAxis(axis2);
        ValueAxis readAxis2 = plot2.getRangeAxis();
        System.out.println("Secondary Axis: " + readAxis2.getLabel());
    }
}