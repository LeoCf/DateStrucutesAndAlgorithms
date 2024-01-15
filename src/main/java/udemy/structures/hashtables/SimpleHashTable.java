package udemy.structures.hashtables;



import udemy.structures.Employee;

/**
 *  Array Implementation
 */
public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    public void put(String key,Employee employee){
        int hashKey = hashKey(key);
        if(hashtable[hashKey] != null){
            System.out.println("Key already taken" + hashKey);
        }
        else{
            hashtable[hashKey] = employee;
        }
    }

    public Employee get(String key){
        int hashKey = hashKey(key);
        return hashtable[hashKey];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

}
