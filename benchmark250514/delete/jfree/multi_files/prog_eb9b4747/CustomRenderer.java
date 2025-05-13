import org.jfree.chart.renderer.Renderer;
import java.awt.Color;
import java.awt.Paint;

public class CustomRenderer implements Renderer {
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
}
