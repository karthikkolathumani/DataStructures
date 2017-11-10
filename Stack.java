package DataStructure;

public class Stack {
	
		 static int top;
		 static int size;
		 static int[] stack;
	
	public  Stack() {
		top=-1;
		size=50;
		stack=new int[50];
	}
	
	public Stack(int size){
		top=-1;
		this.size=size;
		stack=new int[this.size];
	}
	
	
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top]=item;
			return true;
		}
		else
			return false;
		
	}
	
	
	 public static boolean isFull(){
		return (top==stack.length-1);
			
	    

	}
	
	public int pop(){
		return stack[top--];
	}
	
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public static void main(String[] args) {
		Stack sc = new Stack();
		if(!isFull()){
			sc.push(10);
			sc.push(20);
			
		}
		
		System.out.println(sc.pop());
	}
	
}