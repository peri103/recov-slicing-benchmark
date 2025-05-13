import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BlockFrame;
import org.jfree.chart.block.BlockBorder;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Item");
        
        // Create a shape to set
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        
        // Set the color of the legend item
        legendItem.setFillPaint(Color.BLUE);
        
        // Create a legend title and set some properties
        LegendTitle legendTitle = new LegendTitle(legendItem);
        BlockContainer container = new BlockContainer();
        container.add(legendTitle);
        BlockFrame frame = new BlockBorder(Color.BLACK);
        container.setFrame(frame);
        
        // Add more items to the container
        LegendItem anotherItem = new LegendItem("Another Item");
        anotherItem.setFillPaint(Color.RED);
        container.add(new LegendTitle(anotherItem));
        
        /* write */ legendItem.setShape(rectangle);
        
        // Perform operations on the container
        container.setPadding(5, 5, 5, 5);
        
        // Assuming we have some logic that uses the container
        for (int i = 0; i < container.getBlocks().size(); i++) {
            System.out.println("Block " + i + ": " + container.getBlocks().get(i));
        }
        
        /* read */ Shape shape = legendItem.getShape();
        
        // Output the shape to verify
        System.out.println(shape);
        
        // Additional complex logic
        LegendItem thirdItem = new LegendItem("Third Item");
        thirdItem.setFillPaint(Color.GREEN);
        BlockContainer anotherContainer = new BlockContainer();
        anotherContainer.add(new LegendTitle(thirdItem));
        
        // Process another container
        for (int i = 0; i < anotherContainer.getBlocks().size(); i++) {
            System.out.println("Another Block " + i + ": " + anotherContainer.getBlocks().get(i));
        }
    }
}