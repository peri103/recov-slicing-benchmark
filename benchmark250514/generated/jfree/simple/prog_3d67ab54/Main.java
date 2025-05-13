import org.jfree.chart.plot.SpiderWebPlot;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null); // Assuming null dataset for simplicity
        /* write */ plot.setHeadPercent(0.75);
        /* read */ double headPercent = plot.getHeadPercent();
        System.out.println(headPercent);
    }
}