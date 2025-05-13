import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ plot.setSectionOutlineStroke("SectionKey", stroke);
        /* read */ Stroke retrievedStroke = plot.getSectionOutlineStroke("SectionKey");
        
        System.out.println(retrievedStroke);
    }
}