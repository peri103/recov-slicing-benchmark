import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        // Create a label generator
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = piePlot.getLabelGenerator();
        
        System.out.println(retrievedLabelGenerator.equals(labelGenerator));
    }
}