import java.awt.Color;
import java.awt.Paint;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PaintManager paintManager = new PaintManager();

        Section section1 = new Section("Section1", Color.RED);
        Section section2 = new Section("Section2", Color.BLUE);
        Section section3 = new Section("Section3", Color.GREEN);

        paintManager.addSectionPaint(section1.getKey(), section1.getColor());
        paintManager.addSectionPaint(section2.getKey(), section2.getColor());
        paintManager.addSectionPaint(section3.getKey(), section3.getColor());

        /* read */ Paint paint = paintManager.getSectionPaint(section1.getKey());
        System.out.println("Original section paint: " + paint);

        Map<Comparable, Paint> allPaints = paintManager.getAllSectionPaints();
        for (Map.Entry<Comparable, Paint> entry : allPaints.entrySet()) {
            System.out.println("Paint for " + entry.getKey() + ": " + entry.getValue());
        }
    }
}