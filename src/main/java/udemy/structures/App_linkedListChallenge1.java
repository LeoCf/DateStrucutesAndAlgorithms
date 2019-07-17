package udemy.structures;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App_linkedListChallenge1 {
	public static void main(String[] args) {

		Employee employee = new Employee("Leonel", "Camacho", 1);
		Employee employee1 = new Employee("Roberto", "Roberto", 2);
		Employee employee2 = new Employee("Martinez", "Martinez", 3);
		Employee employee3 = new Employee("Montblanc", "Montblanc", 4);
		Employee employee4 = new Employee("Dior", "Sauvage", 5);
		Employee employee5 = new Employee("Nautica", "Blue", 6);
		Employee employee6 = new Employee("Loewe", "Plata", 7);

		EmployeeDoubleLinkedList newChallengeList = new EmployeeDoubleLinkedList();
		newChallengeList.addToFront(employee6);
		newChallengeList.addBefore(employee, employee6);
		newChallengeList.addBefore(employee3, employee6);
		newChallengeList.printList();
	}
}
