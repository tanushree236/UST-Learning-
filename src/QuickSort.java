public class QuickSort {
    public static void quicksort(int a[], int low,int high){
        if(low<high){
            int pi=partition(a,low,high);
            quicksort(a,low,pi-1);
            quicksort(a,pi+1,high);
        }
    }
    private static int partition(int [] a,int low,int high){
        int pi=a[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (a[j]<pi) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
    public static void main(String[] args) {
        int a[] = {3, 6, 2, 1, 5};
        int n = a.length;
        System.out.println("Array Before");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        quicksort(a,0,a.length-1);

        System.out.println("Array After");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
