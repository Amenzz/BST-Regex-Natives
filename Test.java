class Test{
	public static void main(String[] args){

		BinarySearchTree bst = new BinarySearchTree();


		System.out.println("Is the BST1 empty: "+bst.isEmpty());

		bst.insert(4);
		bst.insert(10);
		System.out.println("Is the BST1 still empty: "+bst.isEmpty());
		bst.insert(9);
		bst.insert(2);
		bst.insert(3);
		bst.insert(11);


		System.out.println("Searching for 3 in BST ... .. . ");
		if(bst.search(3)!=null){
			System.out.println("\t We found the node 3 in BST ");
		}
		else System.out.println("\t Oops, the node that you are looking for is not in this BST");

		System.out.println("Searching for 8 in BST ... .. .  ");
		if(bst.search(8)!=null){
			System.out.println("\t We found a node 8 in BST");
		}
		else System.out.println("\t Oops, the node that you are looking for is not in this BST");


		System.out.println("Preorder depth first traversal");
		bst.preOrder(bst.root);

		System.out.println("Inorder depth first traversal");
		bst.inOrder(bst.root);

		System.out.println("Postorder depth frist traversl");
		bst.postOrder(bst.root);

		System.out.println("Breadth first traversing from left to right");
		bst.bft(bst.root);

		System.out.println("Deleting node 7 by Merging  ");
		bst.deleteByMerging(9);


		System.out.println("Inorder depth first traversal of the BST After deleting  ");
		bst.inOrder(bst.root);

		System.out.println("Deleting node 3 by Copying  ");
		bst.deleteByCopying(3);
		System.out.println("Inorder depth first traversal of the BST after deleting ");
		bst.inOrder(bst.root);


		System.out.println("Trying to delete node 1 tha didn't exist in the BST ");
		bst.deleteByMerging(1);
		bst.inOrder(bst.root);



	}
}
