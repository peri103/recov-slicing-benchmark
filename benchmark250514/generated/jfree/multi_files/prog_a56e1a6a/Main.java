import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        ChartUtils chartUtils = new ChartUtils();
        chartUtils.setSectionOutlineColor("Section1", Color.RED);

        DataStructures dataStructures = new DataStructures();
        dataStructures.addData("Math", 95);
        dataStructures.addData("Science", 85);

        // Additional unrelated logic
        int sum = 0;
        for (Integer value : dataStructures.getAllData().values()) {
            sum += value;
        }
        System.out.println("Total score: " + sum);

        // Reading the outline paint for "Section1"
        PiePlot plot = chartUtils.getPlot();
        /* read */ Paint paint = plot.getSectionOutlinePaint("Section1");

        // Final output
        System.out.println("Outline paint for Section1: " + paint);
    }
}