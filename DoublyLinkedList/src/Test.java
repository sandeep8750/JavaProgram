import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

class Node {

	int data;
	Node nextNode;
	Node preNode;

	public Node(int data) {
		this.data = data;
		nextNode = null;
		preNode = null;
	}
}

class Doublyll {

	Node head ;

	Doublyll() {
		this.head = head;
	}

	void insertDll(int data) {
		Node N1 = new Node(data);

		if (head == null) {
			head = N1;
		} else {
			Node p = head;

			while (p.nextNode != null) {
				p = p.nextNode;
			}

			p.nextNode = N1;
			N1.preNode = p;

		}
	}

	void insertMiddle(int position, int data) {

		Node a = new Node(data);
		Node p = head;

		while (p != null && position > 1) {
			p = p.nextNode;
			position--;
		}

		if (p != null && p.nextNode != null) {

			a.nextNode = p.nextNode;
			a.preNode = p;
			p.nextNode.preNode = a;
			p.nextNode = a;
		}

	}

	void print() {
		if (head == null) {
			System.out.println("any element is not found in CircularLinkedList ");
		} else {
			Node p = head;

			System.out.print(p.data + "<->");

			while (p.nextNode != null) {
				p = p.nextNode;
				System.out.print(p.data + "<->");
			}
		}
	}

	void deletionByValue(int value, Doublyll l) {

		Node p = l.head;

		while (p != null && p.data != value) {
			p = p.nextNode;
		}

		if (l.head == p && p.data == value) {
			l.head = p.nextNode;
		} else if (p != null && p.data == value) {
			p.preNode.nextNode = p.nextNode;
		} else {
			System.out.println("Node does not exist ");
		}
	}

}

public class Test {

	public static void main(String[] args) {

		Doublyll doublyll = new Doublyll();

		doublyll.insertDll(10);
		doublyll.insertDll(20);
		doublyll.insertDll(30);
		doublyll.insertDll(40);

		doublyll.insertMiddle(2, 15);
		doublyll.insertMiddle(5, 60);
		doublyll.print();

		doublyll.deletionByValue(40, doublyll);
		doublyll.deletionByValue(10, doublyll);
		doublyll.deletionByValue(30, doublyll);

		System.out.println();
		doublyll.print();
	}

}