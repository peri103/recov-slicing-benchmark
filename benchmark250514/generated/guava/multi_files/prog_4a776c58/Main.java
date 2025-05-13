public class Main {
    public static void main(String[] args) {
        // Initialize CacheManager
        CacheManager cacheManager = new CacheManager();
        
        // Put a value in the cache
        cacheManager.putValue("key", 42);

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Math");
        Course science = new Course("Science");

        // Enroll students in courses
        math.addStudent(alice);
        science.addStudent(bob);

        alice.enroll(math);
        bob.enroll(science);

        // Print student enrollments
        for (Course course : alice.getCourses()) {
            System.out.println(alice.getName() + " is enrolled in " + course.getCourseName());
        }

        for (Course course : bob.getCourses()) {
            System.out.println(bob.getName() + " is enrolled in " + course.getCourseName());
        }

        // Retrieve and print the cached value
        try {
            /* read */ int value = cacheManager.getValue("key");
            System.out.println("Cached value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}