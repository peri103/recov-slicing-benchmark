import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultValueDataset;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        /* write */ plot.setUnits(ThermometerPlot.UNITS_CELSIUS);

        // Additional code to make the program more complex
        DefaultValueDataset dataset = new DefaultValueDataset(25.0);
        plot.setDataset(dataset);
        plot.setBulbRadius(40);
        plot.setMercuryPaint(Color.red);

        JFreeChart chart = ChartFactory.createThermometerChart(
                "Thermometer Chart",
                dataset,
                plot
        );

        JFrame frame = new JFrame("Thermometer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);

        // Simulate some operations
        plot.setBulbRadius(50);
        plot.setMercuryPaint(Color.blue);
        dataset.setValue(30.0);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Temperature reading " + i + ": " + dataset.getValue());
            dataset.setValue(dataset.getValue().doubleValue() + 1.0);
        }

        /* read */ int units = plot.getUnits();
        System.out.println("Units set in ThermometerPlot: " + units);
    }
}