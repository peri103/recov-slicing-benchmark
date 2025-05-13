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

        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ title.setFont(font);
        /* read */ Font readFont = title.getFont();
        System.out.println(readFont);
    }
}