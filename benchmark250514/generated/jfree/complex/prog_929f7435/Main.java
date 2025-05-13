import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        HashMap<String, Color> sectionColors = new HashMap<>();
        
        // Initialize some section colors
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        // Set outline paint for each section using the HashMap
        for (String section : sectionColors.keySet()) {
            piePlot.setSectionOutlinePaint(section, sectionColors.get(section));
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Check the outline paint for Section1
        /* write */ piePlot.setSectionOutlinePaint("Section1", Color.RED);

        // Perform some manipulation on the sectionColors map
        sectionColors.put("Section4", Color.YELLOW);
        sectionColors.put("Section5", Color.ORANGE);
        
        for (String section : sectionColors.keySet()) {
            System.out.println("Section: " + section + ", Color: " + sectionColors.get(section));
        }

        // Retrieve outline paint for Section1
        /* read */ Color outlinePaint = (Color) piePlot.getSectionOutlinePaint("Section1");
        System.out.println("Outline paint for Section1: " + outlinePaint);

        // Further processing on the piePlot, such as setting other properties
        piePlot.setSectionOutlinePaint("Section6", Color.PINK);

        // Print final state of section outline paints
        System.out.println("Final state of section outline paints:");
        for (String section : sectionColors.keySet()) {
            Color paint = (Color) piePlot.getSectionOutlinePaint(section);
            System.out.println("Section: " + section + ", Paint: " + paint);
        }
    }
}