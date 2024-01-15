package udemy.structures;

import udemy.structures.hashtables.SimpleHashTable;
import udemy.structures.stack.LinkedStackString;

public class App_simpleHashTable {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Roberto", "Roberto", 2);
        Employee employee3 = new Employee("Montblanc", "Montblanc", 4);
        Employee employee4 = new Employee("Dior", "Sauvage", 5);
        Employee employee6 = new Employee("Roberto", "Plata", 7);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put(employee1.getFirstName(),employee1);
        ht.put(employee3.getFirstName(),employee3);



    }



}
