package udemy.structures;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App_dataStructures {
	public static void main(String[] args) {

		Employee employee = new Employee("Leonel", "Camacho", 1);
		Employee employee1 = new Employee("Roberto", "Roberto", 2);
		Employee employee2 = new Employee("Martinez", "Martinez", 3);
		Employee employee3 = new Employee("Montblanc", "Montblanc", 4);
		Employee employee4 = new Employee("Dior", "Sauvage", 5);
		Employee employee5 = new Employee("Nautica", "Blue", 6);
		Employee employee6 = new Employee("Loewe", "Plata", 7);
		/*
		EmployeeLinkedList aList = new EmployeeLinkedList();
		aList.addToFront(employee);
		aList.addToFront(employee1);
		aList.addToFront(employee2);
		aList.addToFront(employee3);
		aList.printList();
		
		aList.remoteFromFront();
		aList.remoteFromFront();
		aList.addToFront(employee3);
		aList.remoteFromFront();
		aList.remoteFromFront();
		aList.remoteFromFront();
		aList.printList();
		System.out.println(aList.getSize());
		System.out.println(aList.isEmpty());
		
		
		EmployeeDoubleLinkedList aDoubleList = new EmployeeDoubleLinkedList();
		aDoubleList.addToFront(employee3);
		aDoubleList.addToFront(employee2);
		aDoubleList.addToFront(employee1);
		aDoubleList.addToFront(employee);
		aDoubleList.addToBack(employee4);
		System.out.println("Print full list");
		System.out.println(aDoubleList.getSize());
		aDoubleList.printList();
		aDoubleList.deleteEmployee(3);
		System.out.println("Print after first Delete");
		aDoubleList.printList();
		aDoubleList.deleteEmployee(4);
		System.out.println("Print after second Delete");
		aDoubleList.addAfterNode(employee6, 1);
		aDoubleList.printList();
		aDoubleList.deleteEmployee(1);
		System.out.println("Print after third Delete");
		aDoubleList.printList();
		System.out.println(aDoubleList.getSize());
		aDoubleList.deleteEmployee(2);
		
		System.out.println("Print after 4 Delete");
		aDoubleList.printList();
		System.out.println(aDoubleList.getSize());
		System.out.println("Print after 5 Delete");
		aDoubleList.deleteEmployee(5);
		aDoubleList.addToFront(employee3);
		aDoubleList.printList();
		*/
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(employee1);
		list.add(employee2);
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println("<=>");
		}
		System.out.println("null");
				
	}
}
