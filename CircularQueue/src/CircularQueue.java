
public class CircularQueue {

	int[] a;
	int size, front, rear;

	public CircularQueue(int size) {
		System.out.println("CircularQueue.CircularQueue()");
		a = new int[size];
		this.size = size;
		front = -1;
		rear = -1;
	}

	public int isEmpty() {
		if (front == -1 && rear == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int isFull() {
		if ((rear + 1) % size == front) {
			return 1;
		} else {
			return 0;
		}
	}

	public int getfront() {

		if (isEmpty() == 1) {
			System.out.println("Queue is Empty Boss....");
			return -1;

		} else
			return a[front];
	}

	public void enqueue(int value) {

		if (isFull() == 1) {
			System.out.println("Queue is full Boss.. ");
		} else if (isEmpty() == 1) {
			front++;
			rear++;

			a[rear] = value;
		} else if (isFull() != 1) {
			rear = (rear + 1) % size;
			a[rear] = value;
		}
	}

	public void dequeue() {
		if (isEmpty() == 1) {
			System.out.println("Queue is already Empty Boss...");
		} else {
			System.out.println(a [front] + "Deleted");
			
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
		}
	}

	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(7);

		circularQueue.enqueue(10);
		circularQueue.enqueue(20);
		circularQueue.enqueue(30);
		circularQueue.enqueue(40);
		circularQueue.enqueue(50);
		circularQueue.enqueue(60);

		while (circularQueue.isEmpty() != 1) {
			System.out.println(circularQueue.getfront());
			circularQueue.dequeue();

		}
	}
}
