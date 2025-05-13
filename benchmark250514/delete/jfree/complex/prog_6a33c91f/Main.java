import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        Paint outlinePaint = Color.RED;
        
        // Unrelated complex logic
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("RED", 1);
        colorMap.put("GREEN", 2);
        colorMap.put("BLUE", 3);
        
        Random random = new Random();
        int randomValue = random.nextInt(3) + 1;
        String selectedColor = "RED";
        
        for (Map.Entry<String, Integer> entry : colorMap.entrySet()) {
            if (entry.getValue() == randomValue) {
                selectedColor = entry.getKey();
                break;
            }
        }
        
        // Use the selected color
        if ("GREEN".equals(selectedColor)) {
            outlinePaint = Color.GREEN;
        } else if ("BLUE".equals(selectedColor)) {
            outlinePaint = Color.BLUE;
        }
        
        /* write */ renderer.setOutlinePaint(outlinePaint);
        
        // More unrelated complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // Additional unrelated logic
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Alphabet: " + sb.toString());
        
        /* read */ Paint readOutlinePaint = renderer.getOutlinePaint();
        
        System.out.println("Outline Paint: " + readOutlinePaint);
    }
}