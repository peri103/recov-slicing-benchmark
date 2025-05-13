import java.awt.Color;

public class Section {
    private String name;
    private Color outlineColor;

    public Section(String name, Color outlineColor) {
        this.name = name;
        this.outlineColor = outlineColor;
    }

    public String getName() {
        return name;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }
}
