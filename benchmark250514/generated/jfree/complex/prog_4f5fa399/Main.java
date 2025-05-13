import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot3D piePlot = new PiePlot3D();
        PiePlot piePlot2 = new PiePlot();
        
        // Setting and getting depth factor in PiePlot3D
        /* write */ piePlot.setDepthFactor(0.3);
        
        // Additional configurations for piePlot2
        piePlot2.setLabelGenerator(new StandardPieSectionLabelGenerator());
        PieSectionLabelGenerator labelGen = piePlot2.getLabelGenerator();
        
        // Perform some operations with labelGen
        System.out.println("Label Generator: " + labelGen.getClass().getSimpleName());

        // Setting and getting depth factor in PiePlot3D
        /* read */ double depthFactor = piePlot.getDepthFactor();
        System.out.println("Depth Factor: " + depthFactor);

        // Further manipulation with piePlot2
        piePlot2.setSectionOutlinesVisible(true);
        System.out.println("Section outlines visible: " + piePlot2.getSectionOutlinesVisible());
        
        // Additional unrelated calculations
        double randomFactor = Math.random() * 100;
        System.out.println("Random Factor: " + randomFactor);
        
        // Loop to simulate complex operations
        for (int i = 0; i < 5; i++) {
            double adjustedFactor = depthFactor * (i + 1);
            System.out.println("Adjusted Factor " + i + ": " + adjustedFactor);
        }
    }
}