import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize a CategoryPlot
        CategoryPlot categoryPlot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Initialize another axis and plot for additional complexity
        ValueAxis rangeAxis = new ValueAxis("Range Axis") {};
        XYSeries series = new XYSeries("XY Series");
        series.add(1, 5);
        series.add(2, 7);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        XYPlot xyPlot = new XYPlot(dataset, null, rangeAxis, null);

        // Set the domain axis in the category plot
        /* write */ categoryPlot.setDomainAxis(domainAxis);

        // Perform operations on the XY plot
        xyPlot.setOrientation(PlotOrientation.VERTICAL);
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);

        // Additional operations on the category plot
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row1", "Column1");
        categoryDataset.addValue(5.0, "Row1", "Column2");
        categoryPlot.setDataset(categoryDataset);

        // Read the domain axis back from the category plot
        /* read */ CategoryAxis retrievedAxis = categoryPlot.getDomainAxis();

        // Print the label of the retrieved axis
        System.out.println(retrievedAxis.getLabel());

        // Additional unrelated operations for complexity
        System.out.println("XY Series data:");
        for (int i = 0; i < series.getItemCount(); i++) {
            System.out.println("X: " + series.getX(i) + ", Y: " + series.getY(i));
        }
    }
}