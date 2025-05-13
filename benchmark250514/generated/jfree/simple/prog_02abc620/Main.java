import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(labelGenerator);
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = plot.getLabelGenerator();
        
        System.out.println(retrievedLabelGenerator != null ? "Label Generator set successfully" : "Label Generator not set");
    }
}