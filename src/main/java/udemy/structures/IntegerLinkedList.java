package udemy.structures;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
    	IntegerNode aNodeToInsert = new IntegerNode(value);
        if(head==null) {
        	head=aNodeToInsert;
        	aNodeToInsert.setNext(null);
        }
        else {
    		IntegerNode currentNode = head;
    		IntegerNode previousNode = currentNode;
    		while(currentNode!=null && currentNode.getValue()>value) {
    			previousNode = currentNode;
    			currentNode = currentNode.getNext();
    		}
    		aNodeToInsert.setNext(currentNode);	
    		aNodeToInsert.setValue(value);
    		previousNode.setNext(aNodeToInsert);
    		size++;
    		
    		if(head==currentNode )
    			head=aNodeToInsert;
    	
    	}

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}