import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            // Providing a simple implementation of the abstract Plot class
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

        /* write */ plot.setBackgroundPaint(Color.RED);
        /* read */ Paint paint = plot.getBackgroundPaint();
        
        System.out.println(paint);
    }
}