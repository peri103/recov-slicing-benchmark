import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(labelGenerator);
        
        /* read */ PieSectionLabelGenerator readLabelGenerator = plot.getLabelGenerator();
        
        System.out.println(readLabelGenerator);
    }
}