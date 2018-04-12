/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class 对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        else
            return isSymmetricalCore(pRoot.left, pRoot.right);
    }

    boolean isSymmetricalCore(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left != null && right != null)
            return left.val == right.val && isSymmetricalCore(left.left, right.right) && isSymmetricalCore(left.right, right.left);
        else
            return false;
    }
}
