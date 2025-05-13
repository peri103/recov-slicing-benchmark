import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        /* read */ StandardPieSectionLabelGenerator retrievedLabelGenerator = (StandardPieSectionLabelGenerator) piePlot.getLabelGenerator();
        
        System.out.println(retrievedLabelGenerator);
    }
}