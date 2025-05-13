import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Paint;
import java.awt.Color;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize FastScatterPlot and set domain gridline paint
        FastScatterPlot plot = new FastScatterPlot();
        Paint paint = Color.RED;
        
        /* write */ plot.setDomainGridlinePaint(paint);

        // Create a dataset for demonstration
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart",
            "Category",
            "Value",
            dataset
        );

        // Extract the plot from the chart and perform operations
        Plot categoryPlot = chart.getPlot();
        if (categoryPlot instanceof CategoryPlot) {
            CategoryPlot catPlot = (CategoryPlot) categoryPlot;
            catPlot.setRangeGridlinePaint(Color.BLUE);
            Paint rangePaint = catPlot.getRangeGridlinePaint();
            System.out.println("Category Plot Range Gridline Paint: " + rangePaint);
        }

        // Perform operations on FastScatterPlot
        Paint readPaint = plot.getDomainGridlinePaint();
        /* read */ System.out.println("FastScatterPlot Domain Gridline Paint: " + readPaint);

        // Further operations on the chart
        chart.setTitle("Updated Sample Chart");
        Paint titlePaint = chart.getTitle().getPaint();
        System.out.println("Chart Title Paint: " + titlePaint);
    }
}