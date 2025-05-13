import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a renderer and set its domain paint
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Create a list of colors and add some colors
        List<Color> colorPalette = new ArrayList<>();
        colorPalette.add(Color.RED);
        colorPalette.add(Color.GREEN);
        colorPalette.add(Color.BLUE);
        
        // Choose a color from the palette and set it as the domain paint
        Color chosenColor = colorPalette.get(2);
        
        /* write */ renderer.setDomainPaint(chosenColor);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Create another renderer and set its domain paint based on a condition
        XYStepAreaRenderer anotherRenderer = new XYStepAreaRenderer();
        if (sum > 45) {
            anotherRenderer.setDomainPaint(Color.YELLOW);
        } else {
            anotherRenderer.setDomainPaint(Color.BLACK);
        }
        
        // Retrieve the domain paint from the original renderer and print it
        /* read */ Paint domainPaint = renderer.getDomainPaint();
        System.out.println("Domain Paint of original renderer: " + domainPaint);
        
        // Perform some operations with the second renderer
        Paint anotherDomainPaint = anotherRenderer.getDomainPaint();
        System.out.println("Domain Paint of another renderer: " + anotherDomainPaint);
        
        // Iterate over the color palette and print each color
        for (Color color : colorPalette) {
            System.out.println("Color in palette: " + color);
        }
    }
}