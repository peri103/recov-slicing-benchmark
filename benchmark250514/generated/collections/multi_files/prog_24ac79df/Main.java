import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        HashedMap<String, Integer> map = new HashedMap<>();
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);

        Course course = new Course();
        Student student = new Student("John Doe", course);

        student.enrollInCourse("Mathematics");
        System.out.println("Student: " + student.getName() + " enrolled in " + student.getCourseName());

        // Perform some calculations
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of all values in map: " + sum);

        /* read */ Integer value = map.get("anotherKey");
        System.out.println("Value for 'anotherKey': " + value);
    }
}