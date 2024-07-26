import java.util.Scanner;

public class Main {
static class Stack{
    int stack_size=100;
    int stack[]=new int[stack_size];
    int top=-1;
    boolean isEmpty(){
      return top==-1;
    }
    boolean isFull(){
        return top==stack_size-1;
    }
    void push(int n){
        if (top==stack_size-1){
            System.out.println("Stack is full, cannot insert");
        }
        else {
            stack[++top]=n;
            System.out.println("Inserted");
        }
    }
    void pop(){
        if (top==-1){
            System.out.println("Stack is empty, cannot delete");
        }
        else {
            int value=stack[top--];
            System.out.println("Deleted");
        }
    }
    void peek(){
        System.out.println(top);
    }
    void display(){
        if (isEmpty()==true){
            System.out.println("Stack is empty");
        }
        else {
            for (int i = top; i >=0 ; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    void search(int key){
        if (isEmpty()){
            System.out.println("Stack is empty cannot search");
        }
        else{
            boolean found=false;
            for (int i = top; i >= 0 ; i--) {
                if (key==stack[i]){
                    System.out.println("Element found");
                    found=true;
                    break;
                }
            }
            if (!found){
                System.out.println("Element not found");
            }
        }
    }
    void sort(){
        if (isEmpty()){
            System.out.println("Stack is Empty cannot sort");
        }
        else {
            binaryInsertionSearch();
            System.out.println("Sorted Array");
            display();
        }
    }
    void binaryInsertionSearch(){
        for (int i = 1; i <=top ; i++) {
            int key=stack[i];
            int low=0;
            int high=i-1;
            while (low<=high){
                int mid=low+(high-low)/2;
                if (key < stack[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            for (int j = i-1; j >= low ; j--) {
                stack[j+1]=stack[j];
            }
            stack[low]=key;
        }
    }
}
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        Stack stack=new Stack();
        while (true){
            System.out.println("Menu Operations");
            System.out.println("1. isEmpty");
            System.out.println("2. isFull");
            System.out.println("3. Insertion");
            System.out.println("4. Deletion");
            System.out.println("5. Peek");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.println("8. Search");
            System.out.println("9. Sort");
            System.out.println("Enter your option");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    if (stack.isEmpty()==true){
                        System.out.println("Stack is Empty");
                    }
                    else {
                        System.out.println("Stack is not Empty");
                    }
                    break;
                case 2:
                    if (stack.isFull()==true){
                        System.out.println("Stack is Full");
                    }else {
                        System.out.println("Stack is not Full");
                    }
                    break;
                case 3:
                    System.out.println("Enter a number to insert into the stack");
                    int n= sc.nextInt();
                    stack.push(n);
                    break;
                case 4:
                    stack.pop();
                    break;
                case 5:
                    stack.peek();
                    break;
                case 6:
                    stack.display();
                    break;
                case 7:
                    System.exit(0);
                    break;
                case 8:
                    System.out.println("Enter the element to search");
                    int key=sc.nextInt();
                    stack.search(key);
                    break;
                case 9:
                    stack.sort();
                    break;
                default:
                    System.out.println("Invalid option");

            }
        }


    }

}