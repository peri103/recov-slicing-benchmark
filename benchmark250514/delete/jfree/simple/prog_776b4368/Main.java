import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new ValueAxis() {
            @Override
            public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.ui.RectangleEdge edge) {
                return 0;
            }

            @Override
            public double java2DToValue(double value, java.awt.geom.Rectangle2D area, org.jfree.ui.RectangleEdge edge) {
                return 0;
            }
        };

        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ NumberTickUnit retrievedTickUnit = (NumberTickUnit) axis.getTickUnit();
        System.out.println(retrievedTickUnit.getSize());
    }
}