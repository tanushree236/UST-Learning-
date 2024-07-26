public class SelectionSort {
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

        for (int i = 0; i < n - 1; i++) {
            outerLoopCount++;
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                innerLoopCount++;
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
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
