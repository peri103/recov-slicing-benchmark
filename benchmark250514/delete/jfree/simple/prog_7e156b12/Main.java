import org.jfree.chart.renderer.xy.XYStepRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepRenderer object
        XYStepRenderer renderer = new XYStepRenderer();
        
        // Write operation: Set the base shapes visibility
        /* write */ renderer.setBaseShapesVisible(true);
        
        // Read operation: Retrieve the base shapes visibility
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();
        
        // Output the result
        System.out.println("Base shapes visible: " + isVisible);
    }
}