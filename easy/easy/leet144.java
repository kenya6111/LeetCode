package easy;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leet144{
    public static void main(String[] args) {
        // ツリーのノードを作成
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // ノードを接続してツリーを構築
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        // preorderTraversalメソッドをテスト
        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println(result); // [1, 2, 4, 5, 3] と出力されるはずです。
    }
}

class Solution{
    List<Integer> preorderTraverse(TreeNode root,List<Integer> list) {

        if(root==null)
            return list;
        list.add(root.val);
        preorderTraverse(root.left,list);
        preorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = preorderTraverse(root,list);
        return list;
    }

}