import org.jfree.chart.renderer.Renderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            private Paint[] seriesPaint = new Paint[1];

            @Override
            public Paint getSeriesPaint(int series) {
                return seriesPaint[series];
            }

            @Override
            public void setSeriesPaint(int series, Paint paint) {
                seriesPaint[series] = paint;
            }
            
            // Other methods from Renderer interface can be left unimplemented for this example
        };

        /* write */ renderer.setSeriesPaint(0, Color.RED);
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println(paint);
    }
}