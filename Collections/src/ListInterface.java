import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        //ArrayList
        List<String> words=new ArrayList<>();  // this is mutable
        words.add("Apple"); //adds elements to list
        words.add("Grapes");
        words.add("Cat");
        words.add("Dog");

        System.out.println(words);
        words.add(2,"Human");
        System.out.println(words);
        System.out.println(words.get(1));  //access elements
        System.out.println(words.indexOf(2));  // returns false if element is not present, there 2 is not present in the list so output is false
        System.out.println(words.indexOf("Apple")); // returns true coz Apple is present in the list
        System.out.println(words.size());
        System.out.println(words.contains("Cat"));
        words.set(2,"Flower");
        System.out.println(words);
        System.out.println(words.remove(2));
        System.out.println(words);
        List<String> newwords=new ArrayList<>();
        newwords.addAll(words);
        System.out.println(newwords);

        //Iteration
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
        //or
        for (String i:words){
            System.out.println(i);
        }


        //LinkedList
        List<String> words1=new LinkedList<>();
        words1.add("1");
        words1.add("2");
        System.out.println(words1);

        //Vector List
        List<String> words2=new Vector<>();
        words2.add("Black");
        words2.add("Red");
        System.out.println(words2);

        //for loop operation
        List<String> a1=new ArrayList<>();
        a1.add("Tanu");
        a1.add("Tani");
        a1.add("Karan");
        a1.add("Adi");
        System.out.println(a1);
        for (String i:a1){
            if (i.contains("an")){
                System.out.println(i);
            }
        }
        //Sorting using collections
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(90);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        
    }
}
