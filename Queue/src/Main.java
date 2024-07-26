import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Queue {
        int queue_size = 10;
        int[] queue = new int[queue_size];
        int front = -1;
        int rear = -1;

        boolean isEmpty() {
            return front == -1 || front > rear;
        }

        boolean isFull() {
            return rear == queue_size - 1;
        }

        void enqueue(int n) {
            if (rear == queue_size - 1) {
                System.out.println("Queue is full");
            } else {
                if (front == -1) {
                    front = 0;
                }
                queue[++rear] = n;
                System.out.println("Inserted");
            }
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                int n = queue[front++];
                System.out.println("Deleted");
                if (front > rear) {
                    front = rear = -1;
                }
            }
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println(queue[front]);
            }
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.println(queue[i]);
                }
            }
        }

        void search(int key) {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                boolean found = false;
                for (int i = front; i <= rear; i++) {
                    if (queue[i] == key) {
                        System.out.println("Element found");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Element not found");
                }
            }
        }

        void sort() {
            if (isEmpty()) {
                System.out.println("Queue is empty, cannot sort");
            } else {
                int[] arr = Arrays.copyOfRange(queue, front, rear + 1);
                binaryInsertionSort(arr);
                System.out.println("Sorted Array:");
                for (int i : arr) {
                    System.out.println(i);
                }
            }
        }

        void binaryInsertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int low = 0;
                int high = i - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (key < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                for (int j = i - 1; j >= low; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[low] = key;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        while (true) {
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
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is not Empty");
                    }
                    break;
                case 2:
                    if (queue.isFull()) {
                        System.out.println("Queue is Full");
                    } else {
                        System.out.println("Queue is not Full");
                    }
                    break;
                case 3:
                    System.out.println("Enter a number to insert into the queue");
                    int n = sc.nextInt();
                    queue.enqueue(n);
                    break;
                case 4:
                    queue.dequeue();
                    break;
                case 5:
                    queue.peek();
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.exit(0);
                    break;
                case 8:
                    System.out.println("Enter the element to search");
                    int key = sc.nextInt();
                    queue.search(key);
                    break;
                case 9:
                    queue.sort();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
