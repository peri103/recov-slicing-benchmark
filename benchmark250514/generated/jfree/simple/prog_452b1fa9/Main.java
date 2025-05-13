import org.jfree.chart.plot.PiePlot3D;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot3D object
        PiePlot3D piePlot = new PiePlot3D();
        
        // Set the depth factor using the write method
        /* write */ piePlot.setDepthFactor(0.5);
        
        // Read the depth factor using the read method
        /* read */ double depthFactor = piePlot.getDepthFactor();
        
        // Output the value to verify the read operation
        System.out.println("Depth Factor: " + depthFactor);
    }
}