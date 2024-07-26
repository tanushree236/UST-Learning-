public class PostOrder {
    static class Node{
        int data;
        InOrder.Node left;
        InOrder.Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static InOrder.Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            InOrder.Node newNode=new InOrder.Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void postOrder(InOrder.Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        InOrder.BinaryTree tree=new InOrder.BinaryTree();
        InOrder.Node root=tree.buildTree(nodes);
        //System.out.println(root);
      postOrder(root);
    }
}
