public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.configure("database.url", "jdbc:mysql://localhost:3306/mydb");
        
        // Simulate some application logic
        System.out.println("Application is running...");
        
        /* read */ String dbUrl = app.getConfiguration("database.url");
        System.out.println("Database URL: " + dbUrl);
        
        // More unrelated code
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}