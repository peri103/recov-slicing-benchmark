import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(labelGenerator);
        /* read */ Object retrievedLabelGenerator = plot.getLabelGenerator();
        
        System.out.println(retrievedLabelGenerator);
    }
}