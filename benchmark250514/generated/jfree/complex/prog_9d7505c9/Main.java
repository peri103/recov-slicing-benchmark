import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        ArrayList<Paint> paintList = new ArrayList<>();

        // Initial setup for PiePlot and adding some colors to the list
        plot.setSectionPaint("Section1", Color.BLUE);
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);
        
        /* write */ plot.setLabelBackgroundPaint(Color.RED);
        
        // Manipulating the PiePlot with different colors
        for (int i = 0; i < paintList.size(); i++) {
            plot.setSectionPaint("Section" + (i + 2), paintList.get(i));
        }
        
        // More operations to make the program complex
        Paint defaultPaint = Color.GRAY;
        plot.setSectionOutlinePaint("Outline", defaultPaint);
        paintList.add(defaultPaint);
        
        // Retrieve the label background paint
        /* read */ Paint paint = plot.getLabelBackgroundPaint();
        
        // Print out the retrieved paint
        System.out.println("Label Background Paint: " + paint);

        // Additional operations to further complicate the program
        for (int i = 0; i < paintList.size(); i++) {
            System.out.println("Paint " + (i + 1) + ": " + paintList.get(i));
        }
        
        // Final operations on the PiePlot
        plot.setSectionOutlinePaint("Section1", Color.ORANGE);
        System.out.println("Outline Paint for Section1: " + plot.getSectionOutlinePaint("Section1"));
    }
}