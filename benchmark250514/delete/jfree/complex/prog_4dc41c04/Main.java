import org.jfree.chart.title.Title;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

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

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        for (String str : stringList) {
            System.out.println("String: " + str);
        }

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        Font retrievedFont = title.getFont();
        /* read */ System.out.println("Font: " + retrievedFont.getFontName() + ", Style: " + retrievedFont.getStyle() + ", Size: " + retrievedFont.getSize());

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number: " + numberList.get(i));
        }
    }
}