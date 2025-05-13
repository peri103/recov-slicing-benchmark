import org.jfree.chart.plot.SpiderWebPlot;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        /* write */ plot.setHeadPercent(0.5);
        /* read */ double headPercent = plot.getHeadPercent();
        System.out.println(headPercent);
    }
}