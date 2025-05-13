import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Comparable key = "SampleKey";
        Stroke stroke = new BasicStroke(2.0f);

        /* write */ plot.setSectionOutlineStroke(key, stroke);
        /* read */ Stroke retrievedStroke = plot.getSectionOutlineStroke(key);

        System.out.println(retrievedStroke.equals(stroke));
    }
}