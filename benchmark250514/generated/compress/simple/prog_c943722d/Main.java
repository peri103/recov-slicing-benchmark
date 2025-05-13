import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("exampleEntry");
        
        /* write */ 
        jarEntry.setMethod(JarArchiveEntry.DEFLATED);
        
        /* read */
        int method = jarEntry.getMethod();
        
        System.out.println("Method: " + method);
    }
}