public class Main {
    public static void main(String[] args) {
        ColorMap colorMap = new ColorMap();

        // Add a color mapping
        colorMap.addColorMapping(ColorMap.Color.RED, "Red Color");

        // Perform other operations
        for (ColorMap.Color color : ColorMap.Color.values()) {
            if (color == ColorMap.Color.GREEN) {
                System.out.println("Found GREEN");
            }
        }

        // Retrieve and print the description of the RED color
        /* read */ String value = colorMap.getColorDescription(ColorMap.Color.RED);
        System.out.println(value);

        // Further operations
        for (ColorMap.Color color : ColorMap.Color.values()) {
            colorMap.addColorMapping(color, color.name() + " Color");
        }

        for (ColorMap.Color color : ColorMap.Color.values()) {
            System.out.println("Color: " + color + ", Value: " + colorMap.getColorDescription(color));
        }
    }
}