import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint fillPaint = Color.RED;
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);

        // Additional complex code
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);

        for (int i = 0; i < paintList.size(); i++) {
            renderer.setSeriesFillPaint(i + 1, paintList.get(i));
        }

        for (int i = 0; i < paintList.size(); i++) {
            System.out.println("Series " + (i + 1) + " Fill Paint: " + renderer.getSeriesFillPaint(i + 1));
        }

        // Unrelated complex code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 5);
        }

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Original read operation
        /* read */ Paint readFillPaint = renderer.getSeriesFillPaint(0);
        System.out.println("Series 0 Fill Paint: " + readFillPaint);
    }
}