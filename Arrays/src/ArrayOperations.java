import java.util.Scanner;

public class ArrayOperations {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array=null;
        int size=0;
        while(true){
            System.out.println("Enter your choose");
            System.out.println("1.Initialize");
            System.out.println("2.Insertion");
            System.out.println("3.Deletion");
            System.out.println("4.Search");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            int ch=scanner.nextInt();

            switch (ch){
                case 1:
                    array=initializeArray();
                    size= array.length;
                    break;
                case 2:
                    if (array==null){
                        System.out.println("Array is empty");
                    }
                    else{
                        array=insertion(array,size);
                        size++;
                    }
                    break;
                case 3:
                    if (array==null || size==0){
                        System.out.println("Array is empty, cannot delete");
                    }else{
                        array=deletion(array,size);
                        size--;
                    }
                    break;
                case 4:
                    if (array==null || size==0){
                        System.out.println("Array is empty, cannot search");
                    }else{
                        searchElement(array,size);
                    }
                    break;
                case 5:
                    if (array==null || size==0){
                        System.out.println("Cannot display");
                    }else{
                        displayElement(array,size);
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static int[] initializeArray(){
        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();
        int [] newarray=new int[size];
        System.out.println("Array initialized with size "+size);
        return newarray;
    }
    public static int[] insertion(int [] array,int size){
        System.out.println("Enter the element to insert");
        int ele=scanner.nextInt();
        int newarray[]=new int[size+1];
        System.arraycopy(array,0,newarray,0,size);
        newarray[size]=ele;
        System.out.println("Element inserted");
        return newarray;
    }
    public static int[] deletion(int[] array,int size){
        System.out.println("Enter the idex of the element to delete");
        int idx=scanner.nextInt();
        if (idx<0 || idx>=size){
            System.out.println("Cannot delete");
        }
        int newarray[]=new int[size-1];
        System.arraycopy(array,0,newarray,0,idx);
        System.arraycopy(array,idx+1,newarray,idx,size-idx-1);
        System.out.println("Element deleted");
        return newarray;
    }
    public static void searchElement(int [] array,int size){
        System.out.println("Enter the element to search");
        int key=scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(key==array[i]){
                System.out.println("Element found");
                return;
            }else {
                System.out.println("Element not found");
            }
        }
    }
    public static void displayElement(int [] array,int size){
        System.out.println("Elemets are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
}
