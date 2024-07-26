public class BubbleSort {
    public static void main(String[] args) {
        int a[]={3,6,2,1,5};
        int n=a.length;
        System.out.println("Array Before");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int innerLoopCount = 0;
        int outerLoopCount = 0;
        for (int i = 0; i < n; i++) {
            outerLoopCount++;
            for (int j = 0; j < n-1; j++) {
                innerLoopCount++;
                if(a[j+1]<a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }



        System.out.println("Array After");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Outer loop iterations: " + outerLoopCount);
        System.out.println("Inner loop iterations: " + innerLoopCount);
    }
}
