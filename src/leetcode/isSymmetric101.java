package leetcode;

import util.TreeNode;

public class isSymmetric101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//不会写递归呀！！！
	public boolean isSymmetric(TreeNode root) {
        
		return isSymmetric(root, root);
    }
	public boolean isSymmetric(TreeNode left, TreeNode right){
		
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		
		return (left.val == right.val) 
				&& isSymmetric(left.left, right.right) 
				&& isSymmetric(left.right, right.left);
	}
}
