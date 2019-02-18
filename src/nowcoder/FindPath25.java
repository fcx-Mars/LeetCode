package nowcoder;

import java.util.ArrayList;

import util.TreeNode;

public class FindPath25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
	private ArrayList<Integer> subList = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root == null) return listAll;
		subList.add(root.val);
		target -= root.val;
		if(target == 0 && root.left == null && root.right == null) {
			listAll.add(new ArrayList<>(subList));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		subList.remove(subList.size()-1);
		
		return listAll;
    }
}
