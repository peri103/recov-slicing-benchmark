import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        XYShapeRenderer anotherRenderer = new XYShapeRenderer();
        
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);
        
        /* write */ renderer.setOutlinePaint(Color.RED);
        
        for (Paint paint : paintList) {
            anotherRenderer.setOutlinePaint(paint);
        }
        
        Paint somePaint = anotherRenderer.getOutlinePaint();
        System.out.println("AnotherRenderer Outline Paint: " + somePaint);
        
        Paint defaultPaint = Color.BLACK;
        renderer.setOutlinePaint(defaultPaint);
        
        Paint finalPaint = anotherRenderer.getOutlinePaint();
        System.out.println("AnotherRenderer Final Outline Paint: " + finalPaint);
        
        /* read */ Paint outlinePaint = renderer.getOutlinePaint();
        
        System.out.println("Renderer Outline Paint: " + outlinePaint);
        
        // Additional unrelated complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        
        for (int number : numbers) {
            System.out.println("Doubled number: " + number);
        }
    }
}