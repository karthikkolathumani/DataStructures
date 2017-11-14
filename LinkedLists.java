
public class LinkedLists {
	
	private Node head;
	
	class Node{
		private int value;
		private Node address;
		
	}
	
	public LinkedLists(int init){
		head = new Node();
		head.value = init;
		head.address = null;
	}
	
	public boolean inserRec(int element){
		Node n = new Node();
		n.value = element;
		n.address = head;
		head = n;
		return true;
		
	}
	
	public void print(){
		Node z = head;
		while(z!=null){
			System.out.println(z.value);
			z = z.address;
		}
		
	}
	
	public boolean deleteNode(int item){
		if(head.value == item){
			head = head.address;
			return true;
		}
		else{
		
		Node x = head;
		Node y = head.address;
		
		while(true){
			if(y == null || y.value == item){
				break;
			}
			else {
				x = y;
				y = y.address;
			}
				
		}
		
		if(y!=null){
			x.address = y.address;
			return true;
		}
		else{
			return false;
			
		}
	}
	}
	
	
	public static void main(String[] args) {
		LinkedLists ls = new LinkedLists(2);
		ls.inserRec(12);
		ls.inserRec(23);
		ls.print();
		System.out.println(ls.deleteNode(2));
		ls.print();
	
	}
	
	
	
	

}
