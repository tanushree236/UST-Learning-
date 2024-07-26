import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<>();
        nums.add(1234);
        nums.add(123);
        nums.add(12);
        nums.add(1);
        System.out.println(nums);

        Set<Integer> nums1=new LinkedHashSet<>();
        nums1.add(1234);
        nums1.add(123);
        nums1.add(12);
        nums1.add(1);
        System.out.println(nums1);

        Set<Integer> nums2=new TreeSet<>();
        nums2.add(1234);
        nums2.add(123);
        nums2.add(12);
        nums2.add(1);
        System.out.println(nums2);

        Set<String> chars=new HashSet<>();
        chars.add("A");
        chars.add("b");
        chars.add("C");
        System.out.println(chars);

        List<String> list1=List.of("A","Z","A","B","Z","F");
        Set<String> set1=new HashSet<>();
        set1.addAll(list1);
        System.out.println(set1);
        //can also be done like this
        Set<String> set2=new LinkedHashSet<>(list1);
        System.out.println(set2);
        Set<String> set3=new TreeSet<>();
        set3.addAll(list1);
        System.out.println(set3);



    }
}
