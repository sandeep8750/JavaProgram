

class Stack {
	private int a[];
	private int top;
	private int size;
	

	Stack(int size) {
		a = new int[size];
		this.size = size;
		top = -1;
	} 

	int isFull() {

		if (top == size - 1) {
			return 1;
		} else {
			return 0;
		}
	}

	int isEmpty() {

		if (top == - 1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	int top(){
		if(isEmpty()== 1)
		{
			System.out.println("Stack Underflow");
			return -1;
		}else 
			return a[top];
	}
	
	void push(int x ) {
		if(isFull()== 1)
		{
			System.out.println("Stack overflow...");
		}
		else {
			top++ ; 
			a[top] = x;
		}
	}
	
	
	void pop( ) {
		
		if(isEmpty() == 1 ) {
			System.out.println("Stack underflow...");
		}
		else {
			top--;  
		}
	}
	

}

public class Test {

	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);	
		
		System.out.println(stack.top());
		
		stack.pop();
		System.out.println(stack.top());
		
		stack.pop();
		System.out.println(stack.top());
		
		stack.pop();
		System.out.println(stack.top());
		
		stack.pop();
		System.out.println(stack.top());
		
		stack.pop();
		System.out.println(stack.top());
		
		
	}

}
