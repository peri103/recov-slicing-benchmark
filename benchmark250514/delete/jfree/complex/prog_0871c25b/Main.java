import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.awt.Color;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        /* write */ plot.setValueFormat(format);
        
        // Additional code utilizing MeterPlot and JFreeChart
        MeterPlot meterPlot = new MeterPlot();
        meterPlot.setDialBackgroundPaint(Color.GRAY);
        meterPlot.setNeedlePaint(Color.RED);
        
        JFreeChart chart = ChartFactory.createMeterChart(
            "Sample Meter Chart",
            meterPlot
        );
        
        // Modify the chart title
        chart.setTitle("Updated Meter Chart Title");
        
        // Print chart details
        System.out.println("Chart Title: " + chart.getTitle().getText());
        
        // More complex operations
        int[] dataPoints = {10, 20, 30, 40, 50};
        for (int point : dataPoints) {
            System.out.println("Data Point: " + point);
        }
        
        // Continue with original read operation
        /* read */ DecimalFormat readFormat = (DecimalFormat) plot.getValueFormat();
        
        System.out.println("Value Format: " + readFormat.toPattern());
    }
}