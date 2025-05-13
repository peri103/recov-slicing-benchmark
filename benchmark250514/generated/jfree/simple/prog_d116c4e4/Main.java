import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setSectionOutlinePaint("Section1", Color.RED);
        /* read */ java.awt.Paint paint = piePlot.getSectionOutlinePaint("Section1");
        System.out.println(paint);
    }
}