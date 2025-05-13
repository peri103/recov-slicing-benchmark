import org.jfree.chart.title.Title;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Assuming we have a concrete implementation of Title, since Title is abstract
        Title title = new MyTitle(); // Replace MyTitle with actual implementation

        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ title.setFont(font);

        /* read */ Font retrievedFont = title.getFont();
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
    }
}

// Mock implementation of Title for demonstration purposes
class MyTitle extends Title {
    private Font font;

    @Override
    public void setFont(Font font) {
        this.font = font;
    }

    @Override
    public Font getFont() {
        return this.font;
    }

    // Other methods would be implemented here...
}