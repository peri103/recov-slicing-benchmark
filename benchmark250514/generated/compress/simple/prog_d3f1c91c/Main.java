import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setTime(1625072400000L); // Set time to a specific timestamp
        /* read */ long time = jarEntry.getTime();
        System.out.println(time);
    }
}