import org.jfree.chart.plot.PiePlot3D;

public class Main {
    public static void main(String[] args) {
        PiePlot3D plot = new PiePlot3D();
        /* write */ plot.setDepthFactor(0.5);
        /* read */ double depthFactor = plot.getDepthFactor();
        System.out.println(depthFactor);
    }
}