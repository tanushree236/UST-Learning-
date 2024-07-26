public class LinearSearch {
    public static void main (String args[]){
        int a[]={3,6,2,1,5};
        int key=9;
        int n=a.length;
        int result=LinearSearchKey(a,key);
        if(result!=-1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }


    }
    public static int LinearSearchKey(int a[],int key){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
