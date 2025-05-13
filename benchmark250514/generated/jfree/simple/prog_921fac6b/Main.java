import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Comparable key = "Section1";
        Paint paint = Color.RED;

        /* write */ piePlot.setSectionPaint(key, paint);
        /* read */ Paint retrievedPaint = piePlot.getSectionPaint(key);

        System.out.println(retrievedPaint);
    }
}