public class Main {
    public static void main(String[] args) {
        ChartManager manager = new ChartManager();
        ChartPanel panel = manager.getPanel();

        // Check if mouse wheel is enabled
        boolean isDomainZoomable = panel.isDomainZoomable();
        System.out.println("Domain Zoomable: " + isDomainZoomable);

        // Finally, check if mouse wheel is enabled
        /* read */ boolean isMouseWheelEnabled = panel.isMouseWheelEnabled();
        System.out.println("Mouse Wheel Enabled: " + isMouseWheelEnabled);
    }
}