import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static int removeDup(List<Integer>nums){
        if(nums.size()==0){
            return 0;
        }
        int i=0;
        for (int j = 1; j < nums.size(); j++) {
            if (!nums.get(j).equals(nums.get(i))){
                i++;
                nums.set(i,nums.get(j));
            }
        }           
        while (nums.size()>i+1){
            nums.remove(nums.size()-1);
        }
        return i+1;
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(List.of(1,1,2,3,3));
        int len=removeDup(nums);
        System.out.println(len);
        System.out.println(nums);
    }
}
