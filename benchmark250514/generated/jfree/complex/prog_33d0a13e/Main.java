import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PiePlot;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PiePlot3D piePlot3D = new PiePlot3D();
        PiePlot piePlot = new PiePlot();
        
        // Some unrelated code to make the program more complex
        ArrayList<Double> depthFactors = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            depthFactors.add(i * 0.1);
        }
        
        for (Double factor : depthFactors) {
            piePlot.setShadowPaint(null); // Using a method from PiePlot to add complexity
        }
        
        /* write */ piePlot3D.setDepthFactor(0.3);
        
        double totalDepth = 0;
        for (Double factor : depthFactors) {
            totalDepth += factor;
        }
        
        // Another unrelated code block
        double averageDepth = totalDepth / depthFactors.size();
        System.out.println("Average Depth Factor: " + averageDepth);
        
        /* read */ double depthFactor = piePlot3D.getDepthFactor();
        System.out.println("Depth Factor from PiePlot3D: " + depthFactor);
        
        // Additional code using similar API pairs
        PiePlot3D anotherPiePlot3D = new PiePlot3D();
        anotherPiePlot3D.setDepthFactor(0.5);
        double anotherDepthFactor = anotherPiePlot3D.getDepthFactor();
        System.out.println("Another Depth Factor: " + anotherDepthFactor);
    }
}