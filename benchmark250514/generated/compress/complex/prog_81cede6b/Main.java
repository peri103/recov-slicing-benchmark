import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        ArrayList<Integer> modes = new ArrayList<>();
        modes.add(0644);
        modes.add(0755);
        modes.add(0700);

        // Set the mode using the first element in the list
        /* write */ tarEntry.setMode(modes.get(0));

        // Perform some operations
        int sum = 0;
        for (int i = 0; i < modes.size(); i++) {
            sum += modes.get(i);
        }
        System.out.println("Sum of modes: " + sum);

        // Manipulate the list
        modes.remove(2);
        modes.add(0777);
        System.out.println("Modes after modification: " + modes);

        // Read the mode back from the TarArchiveEntry
        /* read */ int mode = tarEntry.getMode();
        System.out.println("Mode set in tarEntry: " + mode);

        // More complex logic
        if (mode == 0644) {
            System.out.println("The mode is read-write for owner, read-only for group and others.");
        } else {
            System.out.println("The mode is different.");
        }

        // Additional logic to demonstrate complexity
        ArrayList<String> descriptions = new ArrayList<>();
        descriptions.add("Read-Write for Owner");
        descriptions.add("Read-Execute for Group");
        descriptions.add("No Access for Others");

        for (String desc : descriptions) {
            System.out.println("Description: " + desc);
        }
    }
}