import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagram (String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char [] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedstr=new String(charArray);
            if(!map.containsKey(sortedstr)){
                map.put(sortedstr,new ArrayList<>());
            }
            map.get(sortedstr).add(str);
        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String [] input={"ate","eat","tea","tan","nat","bat"};
        List<List<String>> result=groupAnagram(input);
        for (List<String> group:result){
            System.out.println(group);
        }
    }
}
