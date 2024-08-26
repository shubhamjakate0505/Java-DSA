import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static Node insert(Node root,int val){//root And New Value
        if(root==null){
            root=new Node(val);//create new Node 
            return root;
        }
        if(root.data>val){
            //left.data
           root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
          return root;
    }
    public static void inOrder(Node root){
       
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
       
        inOrder(root.right);
        
    }
    
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

    inOrder(root);
    System.out.println();

    }
}