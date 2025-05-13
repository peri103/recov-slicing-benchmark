import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot thermometerPlot = new ThermometerPlot();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        // Complex logic involving ThermometerPlot
        thermometerPlot.setSubrangePaint(0, Color.RED);
        thermometerPlot.setSubrangePaint(1, Color.GREEN);
        thermometerPlot.setSubrangePaint(2, Color.BLUE);
        
        PiePlot piePlot = new PiePlot();
        piePlot.setSectionPaint("Section1", Color.YELLOW);
        piePlot.setSectionPaint("Section2", Color.ORANGE);
        
        // Perform some operations on PiePlot
        piePlot.setExplodePercent("Section1", 0.1);
        piePlot.setExplodePercent("Section2", 0.2);
        
        /* write */ thermometerPlot.setValueFormat(decimalFormat);
        
        // Intermediate logic and operations
        double temperature = 37.5;
        thermometerPlot.setValue(temperature);
        
        // More operations, unrelated to ThermometerPlot
        double pieValue = 50.0;
        piePlot.setMaximumLabelWidth(pieValue);
        
        // Retrieve value format from ThermometerPlot
        /* read */ DecimalFormat readFormat = (DecimalFormat) thermometerPlot.getValueFormat();
        
        // Output the pattern of the format
        System.out.println("Thermometer Value Format: " + readFormat.toPattern());
        
        // Further operations with PiePlot
        Color sectionColor = piePlot.getSectionPaint("Section1");
        System.out.println("Section1 Color: " + sectionColor);
        
        // Final operations with ThermometerPlot
        thermometerPlot.setUnits(thermometerPlot.UNITS_CELSIUS);
        System.out.println("Current Temperature: " + thermometerPlot.getValue());
    }
}