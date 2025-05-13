import org.jfree.chart.title.Title;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ title.setFont(font);

        // Create a list of colors
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);

        // Set and get color for title
        title.setColor(colors.get(0));
        Color titleColor = title.getColor();
        System.out.println("Title Color: " + titleColor);

        // Perform some operations on the list of colors
        for (Color color : colors) {
            System.out.println("Color: " + color);
        }

        // Create another Title object
        Title anotherTitle = new Title() {
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

        Font anotherFont = new Font("Times New Roman", Font.BOLD, 14);
        anotherTitle.setFont(anotherFont);
        Font anotherReadFont = anotherTitle.getFont();
        System.out.println("Another Title Font: " + anotherReadFont);

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* read */ Font readFont = title.getFont();
        System.out.println("Title Font: " + readFont);
    }
}