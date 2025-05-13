import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        Stroke stroke = new BasicStroke(2.0f); // Create a stroke with a width of 2.0
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Additional use of similar API pairs
        XYStepAreaRenderer renderer2 = new XYStepAreaRenderer();
        Stroke stroke2 = new BasicStroke(1.5f);
        renderer2.setSeriesOutlineStroke(1, stroke2);
        Stroke readStroke2 = renderer2.getSeriesOutlineStroke(1);
        System.out.println("Renderer2 Stroke: " + readStroke2);

        // Interacting with the numbers list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }

        /* read */ Stroke readStroke = renderer.getSeriesOutlineStroke(0);
        System.out.println("Renderer Stroke: " + readStroke);
    }
}