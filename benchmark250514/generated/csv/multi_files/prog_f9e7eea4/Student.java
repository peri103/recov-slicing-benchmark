import java.util.HashMap;

public class Student {
    private String name;
    private int age;
    private HashMap<String, Integer> dataMap;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.dataMap = new HashMap<>();
        this.dataMap.put(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashMap<String, Integer> getDataMap() {
        return dataMap;
    }
}
