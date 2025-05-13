import org.jfree.chart.plot.PiePlot3D;

public class Main {
    public static void main(String[] args) {
        PiePlot3D piePlot3D = new PiePlot3D();
        /* write */ piePlot3D.setDepthFactor(0.3);
        /* read */ double depthFactor = piePlot3D.getDepthFactor();
        System.out.println(depthFactor);
    }
}