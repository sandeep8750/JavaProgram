
class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
	}
}

class CircularLinkedList {
	Node p;
       Node head;

	static CircularLinkedList insert(CircularLinkedList l, int data) {
		Node a = new Node(data);
		if (l.head == null) {
			l.head = a;
		} else {
			Node p = l.head;
			while (p.nextNode != null) {
				p = p.nextNode;
			}
			p.nextNode = a;
		}
		return l;
	}

	static CircularLinkedList insertAtMiddle(CircularLinkedList l, int data, int position) {

		Node a = new Node(data);

		if (position == 0) {
			a.nextNode = l.head;
			l.head = a;
		} else {
			Node p = l.head;

			
			while (position > 1) {
				p = p.nextNode;
				position--;
			}

			a.nextNode = p.nextNode;
			p.nextNode = a;
		}

		return l;
	}

	public static void Deletion(CircularLinkedList l, int value) {
		Node p = l.head;
		Node prev = null;

		if (p != null && p.data == value) {
			l.head = p.nextNode;
		} else {
			while (p != null && p.data != value) {

				prev = p;
				p = p.nextNode;
			}
			if (p != null) {
				prev.nextNode = p.nextNode;

			} else {

			}
		}
	}

	public static void print(CircularLinkedList l) {
		Node start = l.head;

		while (start != null) {
			System.out.print(start.data + "->");
			start = start.nextNode;
		}

	}
}

public class Test {

	public static void main(String[] args) {

		CircularLinkedList l1 = new CircularLinkedList();

		
		CircularLinkedList.insert(l1, 10);
		CircularLinkedList.insert(l1, 20);
		CircularLinkedList.insert(l1, 30);
		CircularLinkedList.insert(l1, 40);
		CircularLinkedList.insert(l1, 50);
		CircularLinkedList.insertAtMiddle(l1, 5, 0);
		CircularLinkedList.insertAtMiddle(l1, 15, 2);

		CircularLinkedList.print(l1);

	}

}
