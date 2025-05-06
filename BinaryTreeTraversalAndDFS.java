import java.util.Stack;

public class BinaryTreeTraversalAndDFS {

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        inorderTraversal(root);

        System.out.println("\nPreorder Traversal:");
        preorderTraversal(root);

        System.out.println("\nPostorder Traversal:");
        postorderTraversal(root);

        System.out.println("\nDFS Traversal:");
        dfs(root);

        System.out.println("\nDFS Iterative Traversal:");
        dfsIterative(root);
    }

    private static void postorderTraversal(TreeNode root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
        }

    private static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        dfs(root.left);
        dfs(root.right);
    }
    public static void dfsIterative(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
