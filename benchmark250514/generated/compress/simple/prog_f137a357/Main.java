import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setTime(1609459200000L); // Set time to January 1, 2021
        /* read */ long time = entry.getTime();
        System.out.println(time);
    }
}