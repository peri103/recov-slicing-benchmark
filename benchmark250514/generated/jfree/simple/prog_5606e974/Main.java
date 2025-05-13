import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setSectionOutlinePaint("Section1", Color.RED);
        /* read */ Paint paint = piePlot.getSectionOutlinePaint("Section1");
        System.out.println(paint);
    }
}