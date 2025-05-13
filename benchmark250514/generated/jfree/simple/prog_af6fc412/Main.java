import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setSectionOutlinePaint("Section 1", Color.RED);
        /* read */ Paint paint = plot.getSectionOutlinePaint("Section 1");
        System.out.println(paint);
    }
}