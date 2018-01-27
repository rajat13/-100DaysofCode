public class StackTester{
    public static void main(String[] args){
        Stack<Integer> stack1 = new ArrayStack<Integer>(3);
        Stack<String> stack2 = new ArrayStack<String>(3);
        Stack<Integer> stack3 = new LinkedStack<Integer>();
        Stack<String> stack4 = new LinkedStack<String>();
        System.out.println(stack1.size());
        stack1.push(1);
        stack1.push(100);
        stack1.push(99);
		stack1.push(1111);
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
 System.out.println(stack2.size());
        stack2.push("Rajat");
        stack2.push("is");
        stack2.push("cool");
        System.out.println(stack2.size());
        System.out.println(stack2.pop());
        System.out.println(stack2.size());
 System.out.println(stack3.size());
        stack3.push(1);
        stack3.push(100);
        stack3.push(99);
        System.out.println(stack3.size());
        System.out.println(stack3.pop());
        System.out.println(stack3.size());
 System.out.println(stack4.size());
        stack4.push("Rajat");
        stack4.push("is");
        stack4.push("cool");
        System.out.println(stack4.size());
        System.out.println(stack4.pop());
        System.out.println(stack4.size());
	}
}
