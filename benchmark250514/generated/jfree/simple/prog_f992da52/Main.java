import org.jfree.chart.renderer.xy.XYStepRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepRenderer renderer = new XYStepRenderer();
        
        // Initialize the step point value
        double stepPoint = 0.5;
        
        /* write */ renderer.setStepPoint(stepPoint);
        /* read */ double readStepPoint = renderer.getStepPoint();
        
        System.out.println("Step Point: " + readStepPoint);
    }
}