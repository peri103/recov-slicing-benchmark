import org.jfree.chart.title.Title;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
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
        
        Font fontToSet = new Font("Serif", Font.PLAIN, 12);
        /* write */ title.setFont(fontToSet);
        /* read */ Font retrievedFont = title.getFont();
        
        System.out.println("Font: " + retrievedFont.getFontName() + ", Style: " + retrievedFont.getStyle() + ", Size: " + retrievedFont.getSize());
    }
}