public class MergeSort {
    public static void MergeSort(int a[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            MergeSort(a,l,mid);
            MergeSort(a,mid+1,r);

            Merge(a,l,mid,r);
        }
    }
    private static void Merge(int a[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int i=0;i<n1;i++){
            larr[i]=a[l+i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i]=a[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;

        while (i<n1 && j<n2){
            if(larr[i]<rarr[j]){
                a[k]=larr[i];
                i++;
            }
            else{
                a[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2){
            a[k]=rarr[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int a[] = {3, 6, 2, 1, 5};
        int n = a.length;
        System.out.println("Array Before");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        MergeSort(a,0,a.length-1);

        System.out.println("Array After");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
