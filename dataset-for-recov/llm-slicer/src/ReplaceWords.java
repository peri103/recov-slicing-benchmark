import java.util.*;
public class ReplaceWords {    
    class TrieNode 
    {
        TrieNode[] next=new TrieNode[26];
        String word;
    }
    TrieNode buildTrie(List<String> words) 
    {
        TrieNode root=new TrieNode();
        for (String w:words) 
        {
            TrieNode p=root;
            for (char c:w.toCharArray()) 
            {
                if (p.next[c-97]==null) p.next[c-97]=new TrieNode();
                p=p.next[c-97];
            }
            p.word=w;
        }
        return root;
    }
    String find(TrieNode now,String s)
    {
        int l=s.length();
        for (int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if (now.next[c-97]==null) return ""; else now=now.next[c-97];
            if (now.word!=null) return now.word;
        }
        return "";
    }
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode root=buildTrie(dict);
        String[] ss=sentence.split(" ");
        StringBuilder ans=new StringBuilder();
        boolean bo=false;
        for (String s:ss)
        {
            String t=find(root,s);
            if (t=="") t=s;
            if (bo) ans.append(" ");
            ans.append(t);
            bo=true;
        }
        return ans+"";
    }
       public static void main(String[] args) {
        ReplaceWords replaceWords = new ReplaceWords();
        
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        
        String result = replaceWords.replaceWords(dict, sentence);
        
        System.out.println("Replaced sentence: " + result);
    }
}