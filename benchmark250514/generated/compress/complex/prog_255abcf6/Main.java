import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setMode(0644);

        ArrayList<Integer> permissions = new ArrayList<>();
        permissions.add(0755);
        permissions.add(0700);
        permissions.add(0644);

        int selectedPermission = permissions.get(2);
        for (int i = 0; i < permissions.size(); i++) {
            if (permissions.get(i) == selectedPermission) {
                System.out.println("Permission matched: " + permissions.get(i));
            }
        }

        int mode;
        if (selectedPermission == 0644) {
            /* read */ mode = entry.getMode();
        } else {
            mode = -1; // Default or error value
        }

        System.out.println("Mode from TarArchiveEntry: " + mode);

        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};
        for (String fileName : fileNames) {
            TarArchiveEntry tempEntry = new TarArchiveEntry(fileName);
            tempEntry.setMode(0755);
            System.out.println("Processed file: " + fileName + " with mode: " + tempEntry.getMode());
        }

        int sumOfModes = 0;
        for (int permission : permissions) {
            sumOfModes += permission;
        }
        System.out.println("Sum of permissions: " + sumOfModes);
    }
}