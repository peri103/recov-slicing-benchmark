import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarRenderer barRenderer = new BarRenderer();
        LineRenderer3D lineRenderer = new LineRenderer3D();

        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            values.add(i * 2.5);
        }

        for (double value : values) {
            lineRenderer.setBase(value);
        }

        /* write */ barRenderer.setBase(10.0);

        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        
        double average = sum / values.size();
        System.out.println("Average of values: " + average);

        double lineBaseValue = lineRenderer.getBase();
        System.out.println("LineRenderer Base Value: " + lineBaseValue);

        double product = 1.0;
        for (double value : values) {
            product *= value;
        }
        System.out.println("Product of values: " + product);

        /* read */ double baseValue = barRenderer.getBase();
        System.out.println("BarRenderer Base Value: " + baseValue);

        double maxValue = Double.MIN_VALUE;
        for (double value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Max value: " + maxValue);

        double minValue = Double.MAX_VALUE;
        for (double value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Min value: " + minValue);
    }
}