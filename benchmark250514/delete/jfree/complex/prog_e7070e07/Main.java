import org.jfree.chart.title.Title;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a Title object
        Title title = new Title() {
            private Font font;
            private Color color;
            
            @Override
            public void setFont(Font font) {
                this.font = font;
            }
            
            @Override
            public Font getFont() {
                return this.font;
            }
            
            public void setColor(Color color) {
                this.color = color;
            }
            
            public Color getColor() {
                return this.color;
            }
        };
        
        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        Font anotherFont = new Font("Times New Roman", Font.BOLD, 14);
        
        // Create a Color object
        Color color = Color.BLUE;
        
        // Create collections to store fonts and colors
        ArrayList<Font> fonts = new ArrayList<>();
        HashMap<String, Color> colorMap = new HashMap<>();
        
        // Add fonts and colors to the collections
        fonts.add(font);
        fonts.add(anotherFont);
        colorMap.put("Primary", color);
        colorMap.put("Secondary", Color.RED);

        // Set the font and color for the title
        /* write */ title.setFont(font);
        title.setColor(color);
        
        // Perform operations on the collections
        for (Font f : fonts) {
            System.out.println("Available Font: " + f.getFontName());
        }
        
        if (colorMap.containsKey("Primary")) {
            Color primaryColor = colorMap.get("Primary");
            System.out.println("Primary Color: " + primaryColor.toString());
        }
        
        // Change the font and color
        title.setFont(anotherFont);
        title.setColor(Color.GREEN);
        
        // Retrieve and print the originally set font
        /* read */ Font readFont = title.getFont();
        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());
        
        // Retrieve and print the color
        Color readColor = title.getColor();
        System.out.println("Color: " + readColor.toString());
    }
}