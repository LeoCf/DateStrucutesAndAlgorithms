package udemy.tree;

import java.util.Objects;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public void insert(int value){
        if(value == data)
            return;
        else if (value < data ){
            if(Objects.isNull(leftChild))
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);
        }
        else {
            if(Objects.isNull(rightChild))
                rightChild = new TreeNode(value);
            else
                rightChild.insert(value);
            }
        }

    public TreeNode(int data) {
        this.data = data;
    }

    public void tranverseInOrder(){
        if(Objects.nonNull(leftChild)){
            leftChild.tranverseInOrder();
        }
        System.out.print("Data = " + data + "");
        if(Objects.nonNull(rightChild)){
            rightChild.tranverseInOrder();
        }
    }


}





