package udemy.tree;

import java.util.Objects;

public class Tree {

    private TreeNode root;


    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else
            root.insert(value);

    }

    public Tree(int value){
        this.root = new TreeNode(1);
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void printTreeInOrder(){
        root.tranverseInOrder();
    }


}
