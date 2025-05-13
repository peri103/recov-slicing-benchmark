import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        /* write */ renderer.setSeriesShapesVisible(0, true);
        /* read */ boolean isVisible = renderer.getSeriesShapesVisible(0);
        System.out.println("Series shapes visible: " + isVisible);
    }
}