import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultValueDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize ThermometerPlot and DecimalFormat
        ThermometerPlot thermometerPlot = new ThermometerPlot();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // Create a dataset for the thermometer
        DefaultValueDataset dataset = new DefaultValueDataset(37.5);

        // Create a JFreeChart using the ThermometerPlot
        JFreeChart chart = ChartFactory.createThermometerChart(
            "Temperature", // chart title
            dataset,       // dataset
            thermometerPlot, // plot
            true           // include legend
        );

        // Set some properties for the plot
        thermometerPlot.setMercuryPaint(Color.RED);
        thermometerPlot.setThermometerPaint(Color.BLACK);

        // Set the value format for the thermometer plot
        /* write */ thermometerPlot.setValueFormat(decimalFormat);

        // Perform some unrelated operations
        thermometerPlot.setRange(0, 50);
        thermometerPlot.setSubrangeInfo(ThermometerPlot.NORMAL, 0, 35);
        thermometerPlot.setSubrangeInfo(ThermometerPlot.WARNING, 35, 37.5);
        thermometerPlot.setSubrangeInfo(ThermometerPlot.CRITICAL, 37.5, 50);

        // Retrieve the value format to verify the original write-read pair
        /* read */ DecimalFormat readFormat = (DecimalFormat) thermometerPlot.getValueFormat();

        // Output the result to verify
        System.out.println("Value Format Pattern: " + readFormat.toPattern());

        // Print some unrelated information about the chart
        System.out.println("Chart Title: " + chart.getTitle().getText());
        System.out.println("Mercury Color: " + thermometerPlot.getMercuryPaint());
        System.out.println("Thermometer Color: " + thermometerPlot.getThermometerPaint());
    }
}