import org.jfree.chart.plot.PiePlot3D;

public class Main {
    public static void main(String[] args) {
        PiePlot3D piePlot = new PiePlot3D();
        /* write */ piePlot.setDepthFactor(0.5);
        /* read */ double depthFactor = piePlot.getDepthFactor();
        System.out.println(depthFactor);
    }
}