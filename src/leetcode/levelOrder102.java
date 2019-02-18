package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class levelOrder102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        
		//if(root == null) return null;   这样写样例[]会过不去
		List<List<Integer>> list = new ArrayList<>();
		if(root == null) return list; 
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int num = queue.size();
			List<Integer> subList = new ArrayList<>();
			for(int i=0; i<num; i++) {
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			list.add(subList);
		}
		
		
		return list;
    }
}


/*DFS速度更快？？？
 * public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }
    
    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }
    */
