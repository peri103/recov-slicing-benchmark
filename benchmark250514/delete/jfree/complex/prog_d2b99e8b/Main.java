import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        LineRenderer3D lineRenderer = new LineRenderer3D();
        
        /* write */ renderer.setBase(5.0);
        
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            values.add(Math.random() * 100);
        }
        
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        
        double average = sum / values.size();
        lineRenderer.setWallPaint(new java.awt.Color((int)average % 255, 100, 150));
        
        double minValue = values.get(0);
        for (double value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        
        lineRenderer.setBase(minValue);
        
        /* read */ double baseValue = renderer.getBase();
        
        System.out.println("Base value from BarRenderer: " + baseValue);
        System.out.println("Average value from ArrayList: " + average);
        System.out.println("Minimum value set in LineRenderer3D: " + minValue);
    }
}