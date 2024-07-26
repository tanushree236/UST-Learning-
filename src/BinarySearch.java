import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={3,6,2,1,5};
         Arrays.sort(a);
        int key=6;
        int result=BinarySearchElement(a,key);
        if(result!=-1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static int BinarySearchElement(int a[],int key){
        int n=a.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }else if(a[mid]<key) {

                low = mid + 1;
            }
                else{
                    high=mid-1;
                }
            }

        return -1;
    }
}
