package udemy.structures.stack;

import java.util.LinkedList;

import udemy.structures.Employee;

public class LinkedStackString {

	private LinkedList<String> stack;
	
	
	public LinkedStackString() {
		stack = new LinkedList<String>();
	}
	
	public void push(String string) {
		stack.addFirst(string);
	}
	
	public String peek() {
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
		for (String string : stack) {
			System.out.println(string);
		}
	}
}
