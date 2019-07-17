package udemy.structures;

public class EmployeeNode {

	private Employee emplyee;
	private EmployeeNode next;
	private EmployeeNode previous;
	
	


	public EmployeeNode getPrevious() {
		return previous;
	}


	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}


	public EmployeeNode(Employee emplyee) {
		super();
		this.emplyee = emplyee;
	}


	public Employee getEmplyee() {
		return emplyee;
	}


	public void setEmplyee(Employee emplyee) {
		this.emplyee = emplyee;
	}


	public EmployeeNode getNext() {
		return next;
	}


	public void setNext(EmployeeNode next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return emplyee.toString();
	}
	
	
	
}
