import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Comparable key = "Section1";
        Paint paint = Color.RED;

        /* write */ plot.setSectionPaint(key, paint);
        /* read */ Paint retrievedPaint = plot.getSectionPaint(key);

        System.out.println(retrievedPaint);
    }
}