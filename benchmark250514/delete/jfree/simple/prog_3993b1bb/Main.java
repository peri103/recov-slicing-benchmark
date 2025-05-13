import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.contour.ContourDataset;

public class Main {
    public static void main(String[] args) {
        ContourPlot plot = new ContourPlot();
        ContourDataset dataset = null; // Initialize with an appropriate ContourDataset implementation

        /* write */ plot.setDataset(dataset);
        /* read */ ContourDataset readDataset = plot.getDataset();

        System.out.println(readDataset);
    }
}