import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        BinaryTree tree=new BinaryTree();
//        tree.populate(scanner);
//        tree.display();
        BinarySearchTree tree=new BinarySearchTree();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
        //there is one problem
        //if the input array is sorted it will create a skewed tree
        //for that we can  take the middle element and insert in the BST
        //then  again take the middle element from one half of the array and perform same operation

        tree.populate(nums);
        tree.display();
    }
}
