package udemy.structures.stack;

import java.util.LinkedList;

import udemy.structures.Employee;

public class LinkedStack {

	private LinkedList<Employee> stack;
	
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee employee) {
		stack.addFirst(employee);
	}
	
	public Employee peek() {
		return stack.getFirst();
	}
	
	public void pop() {
		stack.removeFirst();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
	public void printList() {
		for (Employee employee : stack) {
			System.out.println(employee);
		}
	}
}
