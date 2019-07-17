package udemy.structures;

//Acesso O(n) para qualquer dados com excepçao da head e tailO(1);

public class EmployeeDoubleLinkedList {

	private EmployeeNode head = null;
	private EmployeeNode tail = null;
	private int size = 0;

	public int getSize() {
		return size;
	}

	// linked list add before
	public void addBefore(Employee emplToAdd, Employee currentEmply) {
		EmployeeNode emplyNodeToAdd = new EmployeeNode(emplToAdd);
		if (head != null) {
			EmployeeNode currentNode = head;
			while (currentNode != null && !(currentNode.getEmplyee().equals(currentEmply))) {
				currentNode = currentNode.getNext();
			}
			emplyNodeToAdd.setPrevious(currentNode.getPrevious());
			emplyNodeToAdd.setNext(currentNode);
			if (currentNode == head)
				head = emplyNodeToAdd;
			else
				currentNode.getPrevious().setNext(emplyNodeToAdd);
			currentNode.setPrevious(emplyNodeToAdd);
			size++;

		}

	}

	public void addAfterNode(Employee aEmployee, int idEmpl) {
		if (head != null) {
			EmployeeNode currentNode = head;
			EmployeeNode employeeNodeToInsert = new EmployeeNode(aEmployee);
			while (currentNode != null) {
				Employee employee = currentNode.getEmplyee();
				if (employee.getId() == idEmpl) {
					employeeNodeToInsert.setNext(currentNode.getNext());
					employeeNodeToInsert.setPrevious(currentNode);
					if (currentNode.getPrevious() != null)
						currentNode.getPrevious().setPrevious(employeeNodeToInsert);
					currentNode.setNext(employeeNodeToInsert);
					size++;
					break;
				}
				currentNode = currentNode.getNext();
			}
		}

	}

	public void addToFront(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setNext(head);
		employeeNode.setPrevious(null);
		if (head != null) {
			head.setPrevious(employeeNode);
		}
		head = employeeNode;
		if (size == 0) {
			tail = head;
		}

		head = employeeNode;
		size++;
	}

	public void deleteEmployee(int id) {
		if (head != null) {
			if (head.getEmplyee().getId() == id) {
				if (size == 1) {
					head = null;
					tail = null;
					size--;
				} else {
					head = head.getNext();
				}
			} else {
				EmployeeNode currentEmployeeNode = head.getNext();
				while (currentEmployeeNode != null) {
					Employee currentEmployee = currentEmployeeNode.getEmplyee();
					if (currentEmployee.getId() == id) {
						if (head.getEmplyee() == currentEmployee)
							head = currentEmployeeNode.getNext();
						if (tail.getEmplyee() == currentEmployee)
							tail = currentEmployeeNode.getPrevious();

						if (currentEmployeeNode.getPrevious() != null)
							currentEmployeeNode.getPrevious().setNext(currentEmployeeNode.getNext());
						if (currentEmployeeNode.getNext() != null)
							currentEmployeeNode.getNext().setPrevious(currentEmployeeNode.getPrevious());
						size--;
						break;
					} else
						currentEmployeeNode = currentEmployeeNode.getNext();
				}
			}
		}

	}

	public void addToBack(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setPrevious(tail);
		employeeNode.setNext(null);
		if (tail != null) {
			tail.setNext(employeeNode);
		} else
			head = tail;

		tail = employeeNode;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.println(current);
		while (current != null) {
			current = current.getNext();
			System.out.println(current);
		}
	}

}
