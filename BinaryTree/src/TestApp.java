
public class TestApp {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		
		
		
		binaryTree.root = new Node(10);
		binaryTree.root.leftNode = new Node(20);
		binaryTree.root.rightNode = new Node(30);
		binaryTree.root.leftNode.leftNode = new Node(40);
		binaryTree.root.leftNode.rightNode = new Node(50);
		binaryTree.root.rightNode.leftNode = new Node(60);
		binaryTree.root.rightNode.rightNode = new Node(60);
		

		
		System.out.println("preOrder");
		binaryTree.preOrder(binaryTree.root);
		
		System.out.println();
		System.out.println("inOrder");
		binaryTree.inOrder(binaryTree.root);
		
		System.out.println();
		System.out.println("postOrder");
		binaryTree.postOrder(binaryTree.root);

	}
}