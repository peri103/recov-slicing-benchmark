public class Main {
    public static void main(String[] args) {
        FruitMultisetBuilder builder = new FruitMultisetBuilder();
        builder.addFruits();
        
        ImmutableMultiset<String> multiset = builder.build();
        
        FruitAnalyzer analyzer = new FruitAnalyzer(multiset);
        analyzer.analyzeFruits();
        
        int appleCount = analyzer.getAppleCount();
        System.out.println("Count of 'apple' in multiset: " + appleCount);
    }
}