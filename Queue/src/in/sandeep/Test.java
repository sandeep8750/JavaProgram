package in.sandeep;


class Queue {
	int a[];
	int front;
	int rear;
	int size;

	public Queue(int s) {

		a = new int[s];
		size = s;
		front = -1;
		rear = -1;
	}

	public int isEmpty() {
		if (front == rear) {
			return 1;
		} else {
			return 0;
		}
	}

	public int isFull() {
		if (rear == size - 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public void enqueue(int value) {
		if (isFull() == 1) {
			System.out.println("Queue is full boss....");
		} else {
			if (rear == -1 && front == -1) {
				front++;
				rear++;
				a[rear] = value;
				rear++;
			} else {
				a[rear] = value;
				rear++;
			}
		}
	}

	public void dequeue() {
		if (isEmpty() == 1) {
			System.out.println("Queue is Already Empty boss....");
		} else {
			System.out.println(a[front] + "deleted");
			front++;
			if (front == rear) {
				front = -1;
				rear = -1;
			}
		}
	}
	
	public int getfront() {
		if(isEmpty() ==1 ) {
			System.out.println("Queue is Empty Boss...");
			return -1; 
		}
		else {
			return  a[front]; 
		}
	}
}

public class Test {

	public static void main(String[] args) {
		
		Queue queue = new Queue(6);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		while(queue.isEmpty() != 1) {
			if(queue.getfront() != -1)
			{
				System.out.println(queue.getfront());
				queue.dequeue();
			}
		}
	}

}
