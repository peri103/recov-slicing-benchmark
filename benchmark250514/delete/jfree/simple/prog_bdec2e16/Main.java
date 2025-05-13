import org.jfree.chart.renderer.Renderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            private Paint[] seriesPaints = new Paint[1];

            @Override
            public void setSeriesPaint(int series, Paint paint) {
                seriesPaints[series] = paint;
            }

            @Override
            public Paint getSeriesPaint(int series) {
                return seriesPaints[series];
            }
        };

        /* write */ renderer.setSeriesPaint(0, Color.RED);
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println(paint);
    }
}