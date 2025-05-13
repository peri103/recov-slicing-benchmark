import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryAxis
        CategoryAxis axis = new CategoryAxis();
        
        // Additional unrelated code to make the program more complex
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, null);
        plot.setOrientation(PlotOrientation.VERTICAL);

        // Perform some operations on the plot
        xAxis.setAutoRangeIncludesZero(true);
        yAxis.setAutoRangeIncludesZero(false);

        // Write operation on CategoryAxis
        /* write */
        axis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        // More complex operations
        for (int i = 0; i < series.getItemCount(); i++) {
            double xValue = series.getX(i).doubleValue();
            double yValue = series.getY(i).doubleValue();
            System.out.println("Point " + i + ": (" + xValue + ", " + yValue + ")");
        }

        // Read operation on CategoryAxis
        /* read */
        CategoryLabelPositions positions = axis.getCategoryLabelPositions();
        
        // Print the result of the read operation
        System.out.println("Category Label Positions: " + positions);

        // Additional operations
        if (positions.equals(CategoryLabelPositions.UP_45)) {
            System.out.println("The label positions are set correctly.");
        } else {
            System.out.println("The label positions are not set as expected.");
        }
    }
}