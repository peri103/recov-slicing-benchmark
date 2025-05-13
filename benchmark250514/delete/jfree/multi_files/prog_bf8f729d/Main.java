import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PaintManager paintManager = new PaintManager();
        RandomNumberProcessor processor = new RandomNumberProcessor(10);

        System.out.println("Sum of random numbers: " + processor.getSum());
        System.out.println("Max random number: " + processor.getMax());

        Paint paint = Color.RED;
        paintManager.setPaint(paint);

        System.out.println("Min random number: " + processor.getMin());

        /* read */ Paint retrievedPaint = paintManager.getPaint();
        System.out.println("Retrieved paint: " + retrievedPaint);
    }
}