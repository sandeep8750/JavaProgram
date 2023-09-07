import java.awt.Robot;

class PriorityQueue {
	int a[];
	int front, rear, size;

	public PriorityQueue(int size) {
		a = new int[size];
		front = -1;
		rear = -1;
		this.size = size;
	}

	int isFull() {
		if (rear == size - 1) {
			return 1;
		} else {
			return 0;
		}
	}

	int isEmpty() {
		if (front == -1 && rear == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	int getFront() {

		if (isEmpty() != 1) {
			return a[front];
		} else {
			return 0;
		}
	}

	void insertInQueue(int value) {
		if (isEmpty() == 1) {
			front++;
			rear++;
			a[rear] = value;
		} else if (isEmpty() != 1) {
			int i;

			for (i = rear; i >= 0; i--) {
				if (a[i] < value) {
					a[i + 1] = a[i];
				} else {
					break;
				}
			}
			i++;
			if (i <= rear) {
				a[i] = value;
			} else {
				a[rear + 1] = value;
			}
			rear++;
		}
	}

	/**
	 * 
	 */
	public void dequeue() {

		if (isEmpty() != 1) {
			if (front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				System.out.println(a[front] +"deleted.");
				front++; 
			}
		}
	}

	// main method start here

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue(6);

		priorityQueue.insertInQueue(10);
		priorityQueue.insertInQueue(2);
		priorityQueue.insertInQueue(30);
		priorityQueue.insertInQueue(4);
		priorityQueue.insertInQueue(50);
		priorityQueue.insertInQueue(8);
		

		while (priorityQueue.isEmpty() != 1) {

			System.out.println(priorityQueue.getFront());
			priorityQueue.dequeue();

		}
	}
}
