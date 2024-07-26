public class BSTSearch {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //insert in left subtree
            root.left = insert(root.left, val);

        } else if (root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root,int key){
        if (root==null){
            return false;
        }
        if (root.data>key){
            return search(root.left,key);
        } else if (root.data==key) {
            return true;
        }else {
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        if (search(root,9)){
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
