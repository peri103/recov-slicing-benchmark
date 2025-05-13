import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setSectionPaint("Section1", Color.RED);
        /* read */ Color paint = (Color) plot.getSectionPaint("Section1");
        System.out.println(paint);
    }
}