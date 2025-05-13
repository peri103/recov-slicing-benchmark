import org.jfree.chart.renderer.xy.XYBlockRenderer;

public class Main {
    public static void main(String[] args) {
        XYBlockRenderer renderer = new XYBlockRenderer();
        /* write */ renderer.setBlockWidth(5.0);
        /* read */ double blockWidth = renderer.getBlockWidth();
        System.out.println(blockWidth);
    }
}