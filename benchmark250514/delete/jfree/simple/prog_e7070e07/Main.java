import org.jfree.chart.title.Title;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize a Title object
        Title title = new Title() {
            private Font font;
            
            @Override
            public void setFont(Font font) {
                this.font = font;
            }
            
            @Override
            public Font getFont() {
                return this.font;
            }
        };
        
        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        /* write */ title.setFont(font);
        /* read */ Font readFont = title.getFont();
        
        // Print the font details to verify
        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());
    }
}