import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        BasicStroke stroke = new BasicStroke(2.0f);

        /* write */ piePlot.setSectionOutlineStroke("SectionKey", stroke);
        /* read */ BasicStroke readStroke = (BasicStroke) piePlot.getSectionOutlineStroke("SectionKey");

        System.out.println(readStroke.getLineWidth());
    }
}