import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str="This is the first occassion. It has never happened before";
        str.toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
        char[] characters=str.toCharArray();
        for (char character:characters){
            Integer integer=map.get(character);
            if (integer==null){
                map.put(character,1);
            }else{
                map.put(character,integer+1);
            }
        }
        System.out.println(map);
    }
}
