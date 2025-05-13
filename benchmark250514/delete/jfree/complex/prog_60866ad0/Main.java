import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.awt.Color;
import java.awt.Paint;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Comparable sectionKey1 = "Section 1";
        Comparable sectionKey2 = "Section 2";
        Paint paint1 = Color.RED;
        Paint paint2 = Color.BLUE;
        
        /* write */ piePlot.setSectionPaint(sectionKey1, paint1);
        piePlot.setSectionPaint(sectionKey2, paint2);
        
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        piePlot.setLabelGenerator(labelGenerator);
        
        Map<Comparable, Double> sectionData = new HashMap<>();
        sectionData.put(sectionKey1, 50.0);
        sectionData.put(sectionKey2, 50.0);
        
        double total = 0;
        for (Map.Entry<Comparable, Double> entry : sectionData.entrySet()) {
            total += entry.getValue();
        }
        
        for (Map.Entry<Comparable, Double> entry : sectionData.entrySet()) {
            double percentage = entry.getValue() / total;
            System.out.println("Section: " + entry.getKey() + ", Percentage: " + percentage);
        }
        
        /* read */ Paint retrievedPaint = piePlot.getSectionPaint(sectionKey1);
        System.out.println("Retrieved Paint for " + sectionKey1 + ": " + retrievedPaint);
        
        for (Map.Entry<Comparable, Double> entry : sectionData.entrySet()) {
            Paint paint = piePlot.getSectionPaint(entry.getKey());
            System.out.println("Paint for " + entry.getKey() + ": " + paint);
        }
    }
}