public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {3, 6, 2, 1, 5};
        int n = a.length;
        System.out.println("Array Before");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int innerLoopCount = 0;
        int outerLoopCount = 0;

        int j;
        for (int i = 0; i < n; i++) {
            outerLoopCount++;
            int minIndex=a[i];
            j=i-1;
            while (j>=0 && a[j]>minIndex){
                innerLoopCount++;
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=minIndex;
        }

        System.out.println("Array After");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Outer loop iterations: " + outerLoopCount);
        System.out.println("Inner loop iterations: " + innerLoopCount);
    }
}
