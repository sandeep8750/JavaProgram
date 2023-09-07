class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
	}
}

class CircularLL {

	Node head;

	void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			node.nextNode = head;
			
		} else {
			Node start = head;

			while (start.nextNode != head) {
				start = start.nextNode;
			}

			start.nextNode = node;
			node.nextNode = head;
		}

	}

	public void insertAtMiddle(int data, int position) {
		Node a = new Node(data);

		if (position == 0) {
			a.nextNode = head;
			head = a;
		} else {
			Node p = head;
			while (position > 1) {
				p = p.nextNode;
				position--;
			}

			a.nextNode = p.nextNode;
			p.nextNode = a;
		}
	}
	  

	public void print() {

		Node p = head;

		while (p.nextNode != head) {
			System.out.print(p.data + "->");
			p = p.nextNode;
		}
		System.out.println(p.data);
	}

}


class TestCLL {
	public static void main(String[] args) {
		CircularLL circularLL = new CircularLL();
		
		circularLL.insert(10);
		circularLL.insert(20);
		circularLL.insert(30);
		circularLL.insert(40);
		circularLL.insert(50);
		
		circularLL.print();
		
		circularLL.insertAtMiddle(5, 1);
		circularLL.insertAtMiddle(35, 4);
		
		circularLL.print();
		
		
	}
}