package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class zigzagLevelOrder103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.left = new TreeNode(7);
		List<List<Integer>> res = new ArrayList<>();
		res = zigzagLevelOrder(root);
	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> old = new Stack<>();
        Stack<TreeNode> now = new Stack<>();
        now.push(root);
        while((!now.isEmpty()) || (!old.isEmpty())) {
        	List<Integer> subList = new ArrayList<>();
        	if(!now.isEmpty()) {
//        		for(int i=0; i<now.size(); i++) {
//                    if(now.peek().left != null) old.push(now.peek().left);
//        			if(now.peek().right != null) old.push(now.peek().right);
//        			subList.add(now.pop().val);
//        		}
        		while(!now.isEmpty()) {
                    if(now.peek().left != null) old.push(now.peek().left);
                    if(now.peek().right != null) old.push(now.peek().right);
                    TreeNode temp = now.pop();
                    subList.add(temp.val);
        		}
        	}else {
//        		for(int i=0; i<old.size(); i++) {
//                    if(old.peek().right != null)  now.push(old.peek().right); 
//        			if(old.peek().left != null) now.push(old.peek().left);
//                    subList.add(old.pop().val);
//        		}	
        		while(!old.isEmpty()) {
        			if(old.peek().right != null)  now.push(old.peek().right); 
        			if(old.peek().left != null) now.push(old.peek().left);
        			TreeNode temp = old.pop();
                    subList.add(temp.val);
        		}
        	}
        	res.add(subList);
        }
        
        return res; 
    }
}
/*
 * 递归懵逼，本题stack.size属性用for循环没有，原因未知
 * class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        helper(root,result,0);
        return result;
    }
    public void helper(TreeNode root, List<List<Integer>> result,int level){
        if(root==null){return;}
        if(result.size()<=level){
            result.add(new LinkedList<>());
        }
       
        
        if(level%2==0){
           result.get(level).add(root.val);
        }else{
            result.get(level).add(0,root.val);
        }
         helper(root.left,result,level+1);
        helper(root.right,result,level+1);
    }
}
*/
