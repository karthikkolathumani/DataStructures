
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
	
	public boolean insertLast(int element){
		Node n;
		n = head;
		while(n.address != null){
			n = n.address;
			
		}
		Node last = new Node();
		last.address = null;
		last.value = element;
		n.address = last;
		
		
		return true;
	}
	
	
	public boolean insertMiddle(int element, int search){
		Node sea, sea1;
		
		if(head.value == search ){
			
			Node newNode = new Node();
			
			newNode.value = element;
			newNode.address = head.address;
			head.address = newNode;
			return true;
			
		}
		else{
		sea = head;
		sea1 = head.address;
		while(true){
			if(sea1 == null || sea1.value == search){
				break;
			}
			else
			{
				sea = sea1;
				sea1 = sea1.address;
				
			}
			
		}
		if(sea1!=null){
			Node newNode = new Node();
			
			newNode.value = element;
			newNode.address = sea1.address;
			sea1.address = newNode;
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
		//ls.print();
		//System.out.println(ls.deleteNode(2));
		
		ls.insertLast(100);
		ls.insertMiddle(32, 12);
		ls.print();
	
	}
	
	
	
	

}
