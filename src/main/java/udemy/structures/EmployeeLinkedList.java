package udemy.structures;

//Acesso O(n) para qualquer dados com excepçao da head O(1);
//
public class EmployeeLinkedList {

	private EmployeeNode head =null;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		this.head=node;
		size++;
	}
	
	public void remoteFromFront() {
		size--;
		head=head.getNext();
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.println(current);
		while(current!= null) {
			current=current.getNext();
			System.out.println(current);
		}
	}
	
	public Boolean isEmpty() {
		if(head==null)
			return true;
		else
		return false;
	}
	
}
