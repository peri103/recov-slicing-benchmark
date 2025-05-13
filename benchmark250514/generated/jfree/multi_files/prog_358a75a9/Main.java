import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PaintManager paintManager = new PaintManager();
        PlotManager plotManager = new PlotManager(paintManager);

        // Change the shadow paint for PiePlot
        paintManager.setPaint("PiePlot", new Color(200, 200, 200));

        // Initialize plots with the current paint settings
        plotManager.initializePlots();

        // Print all paints
        paintManager.printAllPaints();

        // Read the shadow paint from PiePlot
        Paint piePlotShadowPaint = plotManager.getPiePlotShadowPaint();
        System.out.println("PiePlot Shadow Paint: " + piePlotShadowPaint);

        // Additional operations
        int shadowBlueComponent = ((Color) piePlotShadowPaint).getBlue();
        System.out.println("Shadow Paint Blue Component: " + shadowBlueComponent);
    }
}