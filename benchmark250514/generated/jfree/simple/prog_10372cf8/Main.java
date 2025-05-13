import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setSectionOutlinePaint("SectionKey", Color.RED);
        /* read */ Color outlinePaint = (Color) plot.getSectionOutlinePaint("SectionKey");
        System.out.println(outlinePaint);
    }
}