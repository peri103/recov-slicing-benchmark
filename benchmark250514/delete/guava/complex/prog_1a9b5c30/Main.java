import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        enum Color { RED, GREEN, BLUE }
        enum Size { SMALL, MEDIUM, LARGE }
        
        // Create an EnumMultiset for Color
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(EnumSet.allOf(Color.class));
        
        // Create an EnumMultiset for Size
        EnumMultiset<Size> sizeMultiset = EnumMultiset.create(EnumSet.allOf(Size.class));
        
        // Add elements to the sizeMultiset
        sizeMultiset.add(Size.SMALL);
        sizeMultiset.add(Size.MEDIUM);
        
        // Add another element to the sizeMultiset
        sizeMultiset.add(Size.LARGE);
        
        // Print the count of each size
        for (Size size : Size.values()) {
            System.out.println("Count of " + size + ": " + sizeMultiset.count(size));
        }
        
        /* write */ colorMultiset.add(Color.RED);
        
        // Add more elements to the colorMultiset
        colorMultiset.add(Color.GREEN);
        colorMultiset.add(Color.BLUE);
        
        // Print the count of each color
        for (Color color : Color.values()) {
            System.out.println("Count of " + color + ": " + colorMultiset.count(color));
        }
        
        // Perform some operations on the colorMultiset
        colorMultiset.add(Color.RED);
        colorMultiset.add(Color.RED);
        
        // Print the updated count of RED
        System.out.println("Updated count of RED: " + colorMultiset.count(Color.RED));
        
        // More complex operations
        sizeMultiset.add(Size.SMALL);
        sizeMultiset.add(Size.SMALL);
        sizeMultiset.add(Size.MEDIUM);
        
        // Print the updated count of sizes
        for (Size size : Size.values()) {
            System.out.println("Updated count of " + size + ": " + sizeMultiset.count(size));
        }
        
        /* read */ int redCount = colorMultiset.count(Color.RED);
        
        System.out.println("Final count of RED: " + redCount);
    }
}