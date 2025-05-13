import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.awt.BasicStroke;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 4.0);
        series.add(3.0, 6.0);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sample Chart",
                "X-Axis",
                "Y-Axis",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        Plot chartPlot = chart.getPlot();
        chartPlot.setOutlineStroke(new BasicStroke(2.0f));
        chartPlot.setBackgroundPaint(Color.GRAY);
        
        /* write */ plot.setDomainGridlinePaint(Color.RED);

        Paint backgroundPaint = chartPlot.getBackgroundPaint();
        System.out.println("Chart Background Paint: " + backgroundPaint);

        Paint outlinePaint = chartPlot.getOutlinePaint();
        System.out.println("Chart Outline Paint: " + outlinePaint);

        Paint gridlinePaint = plot.getRangeGridlinePaint();
        System.out.println("Range Gridline Paint: " + gridlinePaint);

        /* read */ Paint paint = plot.getDomainGridlinePaint();
        System.out.println("Domain Gridline Paint: " + paint);
    }
}