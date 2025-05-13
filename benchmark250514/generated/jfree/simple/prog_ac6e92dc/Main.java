import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;

public class Main {
    public static void main(String[] args) {
        Crosshair crosshair = new Crosshair();
        
        // Create an instance of CrosshairLabelGenerator
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Sample Label";
            }
        };
        
        /* write */ crosshair.setLabelGenerator(labelGenerator);
        
        /* read */ CrosshairLabelGenerator retrievedLabelGenerator = crosshair.getLabelGenerator();
        
        // Use the retrieved label generator to generate a label and print it
        String label = retrievedLabelGenerator.generateLabel(crosshair);
        System.out.println(label);
    }
}