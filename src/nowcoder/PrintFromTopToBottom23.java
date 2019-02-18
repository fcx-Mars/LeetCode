package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

public class PrintFromTopToBottom23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        
		ArrayList<Integer> array = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>(); //此处使用LinkedList比ArrayList耗时会低不少
		if(root == null) return array;
		queue.add(root);
		while(!queue.isEmpty()) {
			if(queue.peek().left != null) queue.add(queue.peek().left);
			if(queue.peek().right != null) queue.add(queue.peek().right);
			array.add(queue.poll().val);
		}
		
		return array;
    }
	public void PrintTree(TreeNode node) {
		if(node == null) return;
	}
}
