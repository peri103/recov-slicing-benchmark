import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.contour.ContourDataset;
import org.jfree.data.contour.DefaultContourDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the ContourPlot object
        ContourPlot plot = new ContourPlot();

        // Initialize the ContourDataset object
        double[] xValues = {1.0, 2.0, 3.0};
        double[] yValues = {4.0, 5.0, 6.0};
        double[] zValues = {7.0, 8.0, 9.0};
        ContourDataset dataset = new DefaultContourDataset("Sample Dataset", xValues, yValues, zValues);

        // Write the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // Read the dataset from the plot
        /* read */ ContourDataset readDataset = plot.getDataset();

        // Output the dataset to verify
        System.out.println("Dataset Name: " + readDataset.getSeriesKey(0));
    }
}