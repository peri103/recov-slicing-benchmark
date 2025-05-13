import org.jfree.chart.renderer.xy.XYBlockRenderer;

public class Main {
    public static void main(String[] args) {
        XYBlockRenderer renderer = new XYBlockRenderer();
        /* write */ renderer.setBlockHeight(5.0);
        /* read */ double blockHeight = renderer.getBlockHeight();
        System.out.println(blockHeight);
    }
}