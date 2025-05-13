import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        /* read */ PieSectionLabelGenerator retrievedGenerator = piePlot.getLabelGenerator();
        
        System.out.println(retrievedGenerator == labelGenerator); // Should print true
    }
}