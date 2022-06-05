public class Node{

	public int key;
	public Node right, left;

	public Node(int key, Node left, Node right){
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public Node(int key){
		this(key,null,null);
	}
}
