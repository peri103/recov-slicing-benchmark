import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(generator);
        /* read */ StandardPieSectionLabelGenerator readGenerator = (StandardPieSectionLabelGenerator) plot.getLabelGenerator();
        
        System.out.println(readGenerator);
    }
}