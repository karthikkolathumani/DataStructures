import DataStructure.People;


public class ObjectQueue {
	int size;
	int total;
	int front;
	int rear;
	People queue[];
	
	public ObjectQueue(){
		size=100;
		total=0;
		front=0;
		rear=0;
		queue = new People[size];
	}
	
	public ObjectQueue(int size){
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = new People[this.size];
	}
	
	public boolean isFull(){
		
		return rear == size-1;
		
	}
	
	public boolean isEmpty(){
		return rear == front;
	}
	
	public boolean enqueue(People element){
		if(!isFull()){
			queue[rear] = element;
			rear++;
			total++;
			return true;
		}
		
			return false;
		
	}
	
	public People dequeue(){
		
			People pc = queue[front];
			front++;
			total--;
			return pc;
		
	}
	
	public static void main(String[] args) {
		People p = new People("Karthik", "29");
		People p1 = new People("Drishte", "24");
		ObjectQueue q = new ObjectQueue();
		q.enqueue(p);
		q.enqueue(p1);
		System.out.println(p.toString());
		System.out.println(p1.toString());
		
		System.out.println(q.dequeue().toString());
		System.out.println(q.dequeue().toString());
		
		
	}

	
}
