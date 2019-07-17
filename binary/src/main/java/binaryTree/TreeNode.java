package binaryTree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public void transverInOrder() {
		if (leftChild != null) {
			leftChild.transverInOrder();
		}
		System.out.println(data);
		if (rightChild != null) {
			rightChild.transverInOrder();
		}

	}

	public void getMin() {
		if (leftChild == null) {
			System.out.println("Valor minimo :" + data);
		} else {
			leftChild.getMin();
		}

	}

	public int getMax() {
		int value = data;
		if (rightChild != null) {
			value = rightChild.getMax();
		}
		return value;
	}

	public TreeNode getValue(int value) {
		if (value == data) {
			return this;
		} else {
			if (value < data) {
				if (leftChild != null) {
					return leftChild.getValue(value);
				}
			} else {
				if (rightChild != null) {
					return rightChild.getValue(value);
				}
			}
		}
		return null;
	}

	public void insert(int value) {
		if (value == data) {
			return;
		}
		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode(value);
			} else {
				leftChild.insert(value);
			}
		} else {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}

}
