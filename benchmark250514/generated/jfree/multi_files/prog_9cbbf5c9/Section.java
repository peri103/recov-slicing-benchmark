import java.awt.Color;

public class Section {
    private Comparable key;
    private Color color;

    public Section(Comparable key, Color color) {
        this.key = key;
        this.color = color;
    }

    public Comparable getKey() {
        return key;
    }

    public Color getColor() {
        return color;
    }
}
