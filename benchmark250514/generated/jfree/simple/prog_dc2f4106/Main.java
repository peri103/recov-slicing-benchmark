import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        
        /* write */ plot.setLabelGenerator(generator);
        /* read */ PieSectionLabelGenerator readGenerator = plot.getLabelGenerator();
        
        System.out.println(readGenerator);
    }
}