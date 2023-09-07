
public class BinaryTree {

	Node root = null;

	public void preOrder(Node root) {

		if (root != null) {
			System.out.print(root.data +"->");
			preOrder(root.leftNode);
			preOrder(root.rightNode);
		}
	}

	public void inOrder(Node root) {

		if (root != null) {
			inOrder(root.leftNode);
			System.out.print(root.data +"->");
			inOrder(root.rightNode);
		}
	}

	public void postOrder(Node root) {

		if (root != null) {
			postOrder(root.leftNode);
			postOrder(root.rightNode);
			System.out.print(root.data +"->");
		}
	}
}
