import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }
        };

        Paint paint = Color.BLUE;
        /* write */ plot.setBackgroundPaint(paint);
        /* read */ Paint retrievedPaint = plot.getBackgroundPaint();
        System.out.println(retrievedPaint);
    }
}