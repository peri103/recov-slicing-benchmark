import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setSectionOutlinePaint("Section1", Color.RED);
        /* read */ Paint paint = plot.getSectionOutlinePaint("Section1");
        System.out.println(paint);
    }
}