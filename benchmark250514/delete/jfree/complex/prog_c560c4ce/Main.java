import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize a CategoryPlot
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Domain Axis");
        
        // Initialize a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Column1");
        dataset.addValue(4.0, "Row1", "Column2");
        dataset.addValue(3.0, "Row2", "Column1");
        dataset.addValue(5.0, "Row2", "Column2");
        
        // Create a chart
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart",
            "Category",
            "Value",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
        );
        
        // Set the chart's plot to our customized plot
        chart.setPlot(plot);
        
        // Set a renderer
        BarRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);
        
        // Set the range axis
        NumberAxis rangeAxis = new NumberAxis("Value");
        plot.setRangeAxis(rangeAxis);
        
        // Set the domain axis
        /* write */ plot.setDomainAxis(axis);
        
        // Do some unrelated operations
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        plot.setRenderer(1, lineRenderer);
        
        // Add another dataset
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(2.0, "Row3", "Column1");
        dataset2.addValue(3.0, "Row3", "Column2");
        plot.setDataset(1, dataset2);
        
        // Retrieve the domain axis
        /* read */ CategoryAxis readAxis = plot.getDomainAxis();
        
        // Print the label of the domain axis
        System.out.println(readAxis.getLabel());
        
        // Perform more unrelated operations
        NumberAxis rangeAxis2 = new NumberAxis("Secondary Value");
        plot.setRangeAxis(1, rangeAxis2);
        
        // Print the dataset values
        for (int i = 0; i < dataset.getRowCount(); i++) {
            for (int j = 0; j < dataset.getColumnCount(); j++) {
                System.out.println("Value: " + dataset.getValue(i, j));
            }
        }
    }
}