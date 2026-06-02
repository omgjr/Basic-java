import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args){
    String line="Java programming is powerful programming";
    String[] collect=line.split(" ");
    Map<String,Integer> words=new HashMap<>();
    for(String word:collect){
        words.put(word,words.getOrDefault(word,0)+1);
    }
    System.out.println(words);
    }
    
}
