package nowcoder;

import util.TreeNode;

public class Convert27 {

//		1.将左子树构造成双链表，并返回链表头节点。
//		2.定位至左子树双链表最后一个节点。
//		3.如果左子树链表不为空的话，将当前root追加到左子树链表。
//		4.将右子树构造成双链表，并返回链表头节点。
//		5.如果右子树链表不为空的话，将该链表追加到root节点之后。
//		6.根据左子树链表是否为空确定返回的节点。
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode Convert(TreeNode pRootOfTree) {
        
		if(pRootOfTree == null) return null;
		if(pRootOfTree.left == null && pRootOfTree.right == null)
			return pRootOfTree;
		TreeNode left = Convert(pRootOfTree.left);
		TreeNode pNode = left;
		while(pNode != null && pNode.right != null) {
			pNode = pNode.right;
		}
		if(left != null) {
			pNode.right = pRootOfTree;
			pRootOfTree.left = pNode;
		}
		TreeNode right = Convert(pRootOfTree.right);
		if(right != null) {
			pRootOfTree.right = right;
			right.left = pRootOfTree;
		}
		return left != null ? left : pRootOfTree;
    }
}
