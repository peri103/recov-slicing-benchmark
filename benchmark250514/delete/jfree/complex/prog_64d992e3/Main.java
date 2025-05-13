import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;
import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        MeterPlot meterPlot = new MeterPlot();
        Paint paint = Color.BLUE;
        Paint gradientPaint = new GradientPaint(new Point2D.Double(0, 0), Color.RED, new Point2D.Double(100, 100), Color.YELLOW);
        
        /* write */ meterPlot.setDialBackgroundPaint(paint);

        // Additional code to make the program more complex
        meterPlot.setDialOutlinePaint(gradientPaint);
        Paint outlinePaint = meterPlot.getDialOutlinePaint();
        System.out.println("Outline Paint: " + outlinePaint);

        // Manipulating some other properties
        meterPlot.setDialShape(MeterPlot.DialShape.CIRCLE);
        System.out.println("Dial Shape: " + meterPlot.getDialShape());

        // Performing some calculations
        int value1 = 5;
        int value2 = 10;
        int result = value1 * value2;
        System.out.println("Calculation Result: " + result);

        // More complex operations
        if (result > 20) {
            meterPlot.setDialBackgroundPaint(gradientPaint);
        }

        // Reading the originally written value
        /* read */ Paint readPaint = meterPlot.getDialBackgroundPaint();
        
        System.out.println("Dial Background Paint: " + readPaint);
    }
}