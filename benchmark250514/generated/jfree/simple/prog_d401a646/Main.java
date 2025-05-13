import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setSectionPaint("Section1", Color.RED);
        /* read */ Color sectionPaint = (Color) piePlot.getSectionPaint("Section1");
        System.out.println(sectionPaint);
    }
}