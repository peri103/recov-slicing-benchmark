import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            private Paint backgroundPaint;

            @Override
            public void setBackgroundPaint(Paint paint) {
                this.backgroundPaint = paint;
            }

            @Override
            public Paint getBackgroundPaint() {
                return this.backgroundPaint;
            }
        };

        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Create a list to store different colors
        List<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);

        // Perform operations on the list
        for (Color color : colorList) {
            System.out.println("Color: " + color.toString());
        }

        // Create another plot and set its background paint using the list
        Plot plot2 = new Plot() {
            private Paint backgroundPaint;

            @Override
            public void setBackgroundPaint(Paint paint) {
                this.backgroundPaint = paint;
            }

            @Override
            public Paint getBackgroundPaint() {
                return this.backgroundPaint;
            }
        };

        plot2.setBackgroundPaint(colorList.get(1));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the background paint from the original plot
        /* read */ Paint paint = plot.getBackgroundPaint();
        System.out.println(paint.toString());

        // Retrieve the background paint from the second plot
        Paint paint2 = plot2.getBackgroundPaint();
        System.out.println("Second plot background paint: " + paint2.toString());

        // Perform more unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}