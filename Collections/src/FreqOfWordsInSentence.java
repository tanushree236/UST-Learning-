import java.util.HashMap;
import java.util.Map;

public class FreqOfWordsInSentence {
    public static void main(String[] args) {
        String str="This is new Occasion . Every Occasion has a new event";
        String[] words=str.split(" ");

        Map<String,Integer> map=new HashMap<>();
        for (String word:words){
            Integer integer=map.get(word);
            if (integer==null){
                map.put(word,1);
            }else{
                map.put(word,integer+1);
            }
        }
        System.out.println(map);
    }
}
