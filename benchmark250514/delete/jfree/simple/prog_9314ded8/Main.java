import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new ValueAxis() {
            @Override
            public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, java.awt.geom.RectangleEdge edge) {
                return 0;
            }

            @Override
            public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, java.awt.geom.RectangleEdge edge) {
                return 0;
            }
        };

        NumberTickUnit tickUnit = new NumberTickUnit(5.0);

        /* write */ axis.setTickUnit(tickUnit);

        /* read */ NumberTickUnit readTickUnit = (NumberTickUnit) axis.getTickUnit();

        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}