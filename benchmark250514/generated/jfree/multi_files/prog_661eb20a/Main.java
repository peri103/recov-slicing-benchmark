import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        ColorPalette colorPalette = new ColorPalette();
        
        // Set positive color using the color palette
        chartRenderer.setPositiveColor(colorPalette.getColor(0));
        
        // Set negative color using the color palette
        chartRenderer.setNegativeColor(colorPalette.getColor(1));
        
        // Print all colors in the palette
        for (Color color : colorPalette.getAllColors()) {
            System.out.println("Palette Color: " + color);
        }
        
        // Retrieve and print the positive color
        /* read */ Color positiveColor = (Color) chartRenderer.getPositiveColor();
        System.out.println("Positive Color: " + positiveColor);
        
        // Retrieve and print the negative color
        Color negativeColor = (Color) chartRenderer.getNegativeColor();
        System.out.println("Negative Color: " + negativeColor);
    }
}