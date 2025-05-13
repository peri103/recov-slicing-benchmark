import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student.enrollCourse(math);
        student.enrollCourse(science);

        math.addGrade(95);
        science.addGrade(88);

        HashBiMap<String, Integer> map = HashBiMap.create();
        /* write */ map.put("key", 123);

        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            for (int grade : course.getGrades()) {
                System.out.println("Grade: " + grade);
            }
        }

        /* read */ int value = map.get("key");
        System.out.println("Original key value: " + value);
    }
}