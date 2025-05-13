import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Main {
    public static void main(String[] args) {
        PiePlot3D piePlot = new PiePlot3D();
        PieDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createPieChart3D(
            "Sample Chart",
            dataset,
            true,
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setStartAngle(90);
        
        /* write */ piePlot.setDepthFactor(0.5);

        double startAngle = plot.getStartAngle();
        System.out.println("Start Angle: " + startAngle);

        piePlot.setCircular(true);
        double depthFactor = piePlot.getDepthFactor();
        
        for (int i = 0; i < 5; i++) {
            plot.setSectionOutlinePaint(i, plot.getSectionPaint(i));
        }

        /* read */ System.out.println("Depth Factor: " + depthFactor);
    }

    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 43.2);
        dataset.setValue("Category 2", 27.9);
        dataset.setValue("Category 3", 79.5);
        return dataset;
    }
}