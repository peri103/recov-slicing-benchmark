import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setTime(1625097600000L); // Setting time to a specific timestamp
        /* read */ long time = entry.getTime();
        System.out.println(time);
    }
}