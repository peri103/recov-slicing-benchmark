import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlotManager plotManager = new PiePlotManager();

        // Create sections and set their outline paints
        Section section1 = new Section("Section1", Color.RED);
        Section section2 = new Section("Section2", Color.BLUE);
        Section section3 = new Section("Section3", Color.GREEN);

        plotManager.setSectionOutline(section1.getName(), section1.getOutlineColor());
        plotManager.setSectionOutline(section2.getName(), section2.getOutlineColor());
        plotManager.setSectionOutline(section3.getName(), section3.getOutlineColor());

        // Retrieve and print the outline paint of Section1
        /* read */ Color outlinePaint = (Color) plotManager.getSectionOutline(section1.getName());
        System.out.println("Section1 Outline Paint: " + outlinePaint);

        // Print all section paints
        plotManager.getAllSectionPaints().forEach((section, paint) -> {
            System.out.println(section + " Outline Paint: " + paint);
        });
    }
}