package binaryTree;

public class Main {

	public static void  main(String[] args) {
		Tree intTree = new Tree();
		intTree.insert(50);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(150);
		intTree.insert(32);
		
		//System.out.println(intTree);
		
		intTree.tranverseInOder();
		
		intTree.getTreeMin();
		
		intTree.getMax();
		
		intTree.getValue(33422);
	}
	
}
