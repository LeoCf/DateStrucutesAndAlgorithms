package udemy.tree;

public class Bst {

    public static void main(String[] args){
        Tree intTree = new Tree(1);

        intTree.insert(2);
        intTree.insert(3);
        intTree.insert(4);
        intTree.insert(7);
        intTree.insert(5);
        intTree.insert(6);
        intTree.printTreeInOrder();
    }


}
