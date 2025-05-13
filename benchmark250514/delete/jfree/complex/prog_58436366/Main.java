import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize Crosshair and LabelGenerator
        Crosshair crosshair = new Crosshair();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Crosshair Label";
            }
        };
        
        // Initialize ValueMarker and ToolTipGenerator
        ValueMarker marker = new ValueMarker(10.0);
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        
        // Set label generator for crosshair
        /* write */ crosshair.setLabelGenerator(labelGenerator);
        
        // Set tool tip generator for marker
        marker.setToolTipText(toolTipGenerator.generateToolTip(null, 0, 0));
        
        // Perform some operations
        marker.setPaint(Color.RED);
        marker.setLabel("Marker Label");
        
        // Read label generator from crosshair
        /* read */ CrosshairLabelGenerator readLabelGenerator = crosshair.getLabelGenerator();
        
        // Print results
        System.out.println(readLabelGenerator.generateLabel(crosshair));
        System.out.println(marker.getLabel());
        
        // Additional operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            marker.setValue(i * 2.5);
            System.out.println("Marker value: " + marker.getValue());
        }
        
        // Modify marker properties
        marker.setLabelFont(marker.getLabelFont().deriveFont(12f));
        marker.setLabelPaint(Color.BLUE);
        
        // Print final state of marker
        System.out.println("Final Marker Label: " + marker.getLabel());
        System.out.println("Final Marker Paint: " + marker.getLabelPaint());
    }
}