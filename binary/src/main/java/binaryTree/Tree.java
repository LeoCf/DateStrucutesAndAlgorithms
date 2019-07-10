package binaryTree;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	public void getValue(int value) {
		
		TreeNode aNode = root.getValue(value);
		if (aNode!=null)
			System.out.println(aNode);
		else
			System.out.println("Nao existe esse valor");

	}
	
	
	public void tranverseInOder() {
		if(root != null) {
			root.transverInOrder();
		}
	}
	
	public void getTreeMin() {
		root.getMin();
	}
	
	public void getMax() {
		int getMax = root.getMax();
		if(getMax>root.getData()) {
			System.out.println("O valor maximo é :"+ getMax);
		}
		else 
			System.out.println("O valor maximo é :"+root.getData());
	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
	
	
	
}
