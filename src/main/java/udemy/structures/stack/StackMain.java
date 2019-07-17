package udemy.structures.stack;

import java.util.concurrent.SynchronousQueue;

import udemy.structures.Employee;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Leonel", "Camacho", 1);
		Employee employee1 = new Employee("Roberto", "Roberto", 2);
		Employee employee2 = new Employee("Martinez", "Martinez", 3);
		Employee employee3 = new Employee("Montblanc", "Montblanc", 4);
		
		ArrayStack aStack = new ArrayStack(6);
		aStack.push(employee);
		aStack.push(employee1);
		aStack.push(employee2);
		aStack.push(employee3);
		Employee aEmp = aStack.peek();
		System.out.println("Peek: "+aEmp);
		aStack.pop();
		System.out.println(aStack.size());
		aStack.printStack();
		
		//Linked list implementation using jdk
		
		System.out.println("LinkedList implementation");
		LinkedStack aList = new LinkedStack();
		aList.push(employee);
		aList.push(employee1);
		aList.push(employee2);
		aList.push(employee3);
		aList.printList();
		aList.pop();
		aList.pop();
		System.out.println("After pop list: "); 
		aList.printList();
		System.out.println(aList.size());
		
	}

}
