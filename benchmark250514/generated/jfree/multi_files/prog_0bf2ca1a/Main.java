import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize ColorManager and PaintReader
        ColorManager colorManager = new ColorManager();
        colorManager.addSectionPaint("Section1", Color.RED);
        colorManager.addSectionPaint("Section2", Color.BLUE);

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Create PaintReader and read the paint for Section1
        PaintReader paintReader = new PaintReader(colorManager.getPiePlot());
        Paint readPaint = paintReader.readSectionPaint("Section1");

        // Print the read paint
        System.out.println("Read paint for Section1: " + readPaint);

        // More unrelated operations
        String[] words = {"apple", "banana", "cherry"};
        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }
}