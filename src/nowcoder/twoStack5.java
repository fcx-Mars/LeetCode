package nowcoder;

import java.util.Stack;

public class twoStack5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	while(!stack2.isEmpty()) {
    		stack1.push(stack2.pop());
    	}
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()) {
    		stack2.push(stack1.pop());
    	}
    	
    	return stack2.pop();
    }
}
/*左程云的《程序员代码面试指南》的答案
 * 链接：https://www.nowcoder.com/questionTerminal/54275ddae22f475981afa2244dd448c6
来源：牛客网

public void push(int node) {
        stack1.push(node);
    }
     
    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
 */



