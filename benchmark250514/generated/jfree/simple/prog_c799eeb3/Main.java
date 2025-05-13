import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        BasicStroke stroke = new BasicStroke(2.0f);
        /* write */ plot.setSectionOutlineStroke("SectionKey", stroke);
        /* read */ BasicStroke retrievedStroke = (BasicStroke) plot.getSectionOutlineStroke("SectionKey");
        System.out.println(retrievedStroke);
    }
}