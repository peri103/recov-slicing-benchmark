import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.PiePlot;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RingPlot plot = new RingPlot();
        PiePlot piePlot = new PiePlot();
        Map<String, Double> data = new HashMap<>();
        data.put("A", 0.2);
        data.put("B", 0.3);
        data.put("C", 0.5);

        // Set up PiePlot with data
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            piePlot.setSectionOutlinePaint(entry.getKey(), null);
            piePlot.setSectionOutlineStroke(entry.getKey(), null);
        }

        // Perform some calculations
        double sum = 0;
        for (Double value : data.values()) {
            sum += value;
        }
        System.out.println("Sum of all sections: " + sum);

        // Set section depth in RingPlot
        /* write */ plot.setSectionDepth(0.5);

        // Modify PiePlot settings
        piePlot.setInteriorGap(0.04);
        piePlot.setLabelGap(0.02);

        // Read section depth from RingPlot
        /* read */ double sectionDepth = plot.getSectionDepth();
        System.out.println("RingPlot Section Depth: " + sectionDepth);

        // More complex operations
        double average = sum / data.size();
        System.out.println("Average value of sections: " + average);

        // Use PiePlot's methods
        piePlot.setCircular(true);
        piePlot.setStartAngle(90);
        System.out.println("PiePlot is circular: " + piePlot.isCircular());
    }
}