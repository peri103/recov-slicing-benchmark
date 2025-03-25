import java.util.EnumMap;
enum Color {
    RED, GREEN, BLUE, YELLOW
}
public class Main {
    public static void main(String[] args) {
        EnumMap<Color, Integer> colorMap = new EnumMap<>(Color.class);
        colorMap.put(Color.RED, 10);
        colorMap.put(Color.GREEN, 20);
        int computation = (int) (Math.random() * 1000);
        if (computation % 2 == 0) {
            colorMap.put(Color.BLUE, 30);
        } else {
            colorMap.put(Color.YELLOW, 40);
        }
        /* write */
        if (computation < 500) {
            colorMap.put(Color.RED, 100);
        }
        computation += 50;
        if (computation > 1030) {
            colorMap.put(Color.GREEN, 200);
        } else if (computation > 1050) {
            colorMap.put(Color.YELLOW, 300);
        }
        /* read */
        int ret = colorMap.get(Color.RED);
        System.out.println("Retrieved value: " + ret);
    }
}