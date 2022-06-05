public class BinarySearchTree{
	public Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	public BinarySearchTree(int key) {
		root = new Node(key);
	}
	public boolean isEmpty(){
		return this.root == null;
	}


	public void  insert (int key ) {
		root = insertRec (root, key);
	}

	public Node insertRec(Node root, int key)
    {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

	public Node search(int key){
		Node temp = this.root;
		while(temp!=null){
			if(temp.key==key) return temp;
			else if(temp.key<key) temp = temp.right;
			else temp = temp.left;
		}
		return null;
	}

	public void visit(Node node){
		System.out.println("\t" + node.key);
	}

	public Node search(Node root, int key)
	{

		if (root==null || root.key==key)
		    return root;
		if (root.key < key)
		   return search(root.right, key);
		return search(root.left, key);
	}


	public void preOrder(Node node){
		if(node!=null){
			visit(node);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.left);
			visit(node);
			inOrder(node.right);
		}
	}

	public void postOrder(Node node){
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			visit(node);
		}
	}

	public void bft(Node node){
		Queue queue = new Queue();
		if(node!=null){
			queue.enqueue(node);
			while(!queue.isEmpty()){
				Node temp = queue.dequeue();
				this.visit(temp);
				if(temp.left!=null) queue.enqueue(temp.left);
				if(temp.right!=null) queue.enqueue(temp.right);
			}
		}
	}






























































	public void deleteByMerging(int key) {
		Node tmp, node, p = root, prev = null;

		while (p != null && p.key != key) {
			prev = p;
			if (p.key < key)
			p = p.right;
			else p = p.left;
		}

		node = p;
		if (p != null && p.key == key) {
			if (node.right == null)
			node = node.left;

			else if (node.left == null)
			node = node.right;
			else {

				tmp = node.left;

				while (tmp.right != null)
				tmp = tmp.right;
				tmp.right =	node.right;
				node = node.left;
			}
			if (p == root)
			root = node;
			else if (prev.left == p)
			prev.left = node;
			else prev.right = node;
		}
		else if (root != null)
			System.out.println("key " + key+ " is not in the tree");
		else System.out.println("the tree is empty");
	}

	public void deleteByCopying(int key) {
		Node node, p = root, prev = null;
		while (p != null && p.key != key)
		{	prev = p;
			if (p.key < key)
			p = p.right;
			else p = p.left;
		}
		node = p;
		if (p != null && p.key == key) {
			if (node.right == null)
			node = node.left;
			else if (node.left == null)
			node = node.right;
			else {
				Node tmp = node.left;
				Node previous = node;
				while (tmp.right != null) {
					previous = tmp;
					tmp = tmp.right;
				}
				node.key = tmp.key;
				if (previous == node)
				previous.left = tmp.left;
				else previous.right = tmp.left;
			}
			if (p == root)
			root = node;
			else if (prev.left == p)
			prev.left = node;
			else prev.right = node;
		}
		else if (root != null)
		System.out.println("key " + key + " is not in the tree");
		else System.out.println("the tree is empty");
	}


























}
