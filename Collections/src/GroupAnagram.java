import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map= new HashMap<>();
        for (String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            if (!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
       String[] input={"eat","tea","ate","tan","nat","bat"};
       List<List<String>> result=groupAnagrams(input);

       for (List<String> group: result){
           System.out.println(group);
       }

    }
}
