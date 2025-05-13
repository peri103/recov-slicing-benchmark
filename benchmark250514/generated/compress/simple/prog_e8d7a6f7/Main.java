import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        byte[] extraData = {1, 2, 3, 4};

        /* write */ jarEntry.setExtra(extraData);
        /* read */ byte[] readData = jarEntry.getExtra();

        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}