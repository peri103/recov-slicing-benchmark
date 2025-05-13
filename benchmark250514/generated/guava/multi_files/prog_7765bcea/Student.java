public class Student {
    private String name;
    private int age;
    private CacheManager cacheManager;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.cacheManager = new CacheManager();
    }

    public void storeInCache(String key, String value) {
        cacheManager.putValue(key, value);
    }

    public String retrieveFromCache(String key) {
        return cacheManager.getValue(key);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
