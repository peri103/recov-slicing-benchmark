import org.jfree.chart.plot.PiePlot;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ plot.setSectionOutlineStroke("Section1", stroke);
        /* read */ Stroke retrievedStroke = plot.getSectionOutlineStroke("Section1");
        
        System.out.println(retrievedStroke);
    }
}