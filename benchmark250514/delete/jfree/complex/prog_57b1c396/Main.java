import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.DefaultXYDataset;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        Dataset dataset = new DefaultPieDataset();
        XYPlot xyPlot = new XYPlot();
        XYDataset xyDataset = new DefaultXYDataset();

        // Setting a dataset to the XYPlot
        xyPlot.setDataset(xyDataset);

        // Performing some operations on the XYPlot
        System.out.println("XYPlot type: " + xyPlot.getPlotType());
        
        // Manipulating the xyDataset
        double[][] data = { {1.0, 2.0, 3.0}, {4.0, 5.0, 6.0} };
        ((DefaultXYDataset) xyDataset).addSeries("Series1", data);

        // Adding more complexity with additional operations
        System.out.println("Series count in XYDataset: " + xyDataset.getSeriesCount());

        // Back to the original Plot
        /* write */ plot.setDataset(dataset);

        // Some dummy operations to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // More operations unrelated to the Plot
        double result = Math.pow(sum, 2);
        System.out.println("Square of the sum: " + result);

        // Finally read the dataset from the original Plot
        /* read */ Dataset readDataset = plot.getDataset();

        // Verifying the dataset
        System.out.println("Dataset successfully set and retrieved: " + (readDataset == dataset));
    }
}