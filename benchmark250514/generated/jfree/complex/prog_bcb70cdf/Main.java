import org.jfree.chart.plot.PiePlot;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Stroke stroke = new BasicStroke(2.0f);
        Stroke anotherStroke = new BasicStroke(1.0f);
        
        /* write */ plot.setSectionOutlineStroke("Section1", stroke);
        
        // Adding more complexity with additional configurations
        plot.setSectionPaint("Section1", Color.RED);
        plot.setSectionPaint("Section2", Color.BLUE);
        
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        plot.setLabelGenerator(labelGenerator);
        
        plot.setExplodePercent("Section1", 0.10);
        
        Stroke retrievedStroke = plot.getSectionOutlineStroke("Section2");
        System.out.println("Stroke for Section2: " + retrievedStroke);
        
        // More operations with the plot
        plot.setSectionOutlineStroke("Section2", anotherStroke);
        plot.setSectionOutlineStroke("Section3", new BasicStroke(3.0f));
        
        // Retrieve the stroke set earlier
        /* read */ Stroke section1Stroke = plot.getSectionOutlineStroke("Section1");
        
        System.out.println("Stroke for Section1: " + section1Stroke);
        
        // Additional operations
        plot.setSectionOutlinePaint("Section1", Color.GREEN);
        plot.setSectionOutlinePaint("Section2", Color.YELLOW);
        
        Stroke section3Stroke = plot.getSectionOutlineStroke("Section3");
        System.out.println("Stroke for Section3: " + section3Stroke);
    }
}