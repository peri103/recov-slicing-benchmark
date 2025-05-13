import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;

public class Main {
    public static void main(String[] args) {
        Crosshair crosshair = new Crosshair();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Custom Label";
            }
        };
        
        /* write */ crosshair.setLabelGenerator(labelGenerator);
        /* read */ CrosshairLabelGenerator retrievedGenerator = crosshair.getLabelGenerator();
        
        System.out.println(retrievedGenerator.generateLabel(crosshair));
    }
}