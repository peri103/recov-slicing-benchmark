import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        ArrayList<String> commentsList = new ArrayList<>();
        HashMap<String, String> metadata = new HashMap<>();
        
        metadata.put("Version", "1.0");
        metadata.put("Author", "John Doe");
        
        commentsList.add("Initial Comment");
        commentsList.add("Second Comment");
        
        // Perform some operations on the metadata
        for (String key : metadata.keySet()) {
            System.out.println(key + ": " + metadata.get(key));
        }
        
        // Add more comments to the list
        commentsList.add("Third Comment");
        commentsList.add("Fourth Comment");
        
        /* write */ jarEntry.setComment("This is a test comment");
        
        // Perform more operations
        for (String comment : commentsList) {
            System.out.println("Comment: " + comment);
        }
        
        // Add a new comment to the list
        commentsList.add("Fifth Comment");
        
        // Manipulate the comments list
        for (int i = 0; i < commentsList.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Even index comment: " + commentsList.get(i));
            }
        }
        
        /* read */ String comment = jarEntry.getComment();
        System.out.println("Jar Entry Comment: " + comment);
        
        // More operations with commentsList
        commentsList.add("Sixth Comment");
        System.out.println("Total Comments: " + commentsList.size());
    }
}