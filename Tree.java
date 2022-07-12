import java.util.*;
import java.lang.Math;
class Node{
    int data;
    Node left,right;
    
    Node(int key){
        this.data = key;
    }
}

public class Tree {

    static Scanner sc = null;

    //Main function
    public static void main(String args[]){
        sc = new Scanner(System.in);

        Node root = createTree();

        //Traversing
        //In Order Function call
        System.out.print("InOrder Traversing is: ");
        inOrder(root);
        System.out.println();

        //Pre Order function call
        System.out.print("PreOrder Traversing is: ");
        preOrder(root);
        System.out.println();

        //Post Order function call
        System.out.print("PostOrder Traversing is: ");
        postOrder(root);
        System.out.println();

        //Level Order Function call
        System.out.print("Level Order Traversing is: ");
        levelOrder(root);
        System.out.println();

        //Heigth of the tree
        int heigth = heightTree(root);
        System.out.println("Height of Tree: "+heigth);

        //Size of the Tree(No. of nodes)
        int size = size(root);
        System.out.println("No. of Nodes in the Tree: "+size);

        //max in the tree
        int max = maximumInTree(root);
        System.out.println("Maximum Node in the Tree: "+max);

        //Right side View of a table
        System.out.println("Right Side View of the Trree");
        rightSideView(root);
    }

    //creating a tree
    public static Node createTree(){
        Node root=null;
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for "+data);
        root.left = createTree();

        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }

    //In Order function defination
    static void inOrder(Node root){
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Pre Order function defination
    static void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Post Order function defination
    static void postOrder(Node root){
        if(root == null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Level Order function defination
    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur = q.poll();
            //this if block is written to print the same level order Node in One line 
            if(cur == null){
                if(q.isEmpty()){
                    return;
                }

                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(cur.data+" ");
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
        }
    }

    //height function definaiton
    static public int heightTree(Node root){
        if(root == null)return 0;

        return Math.max(heightTree(root.left),heightTree(root.right))+1;
    }

    //size funtion defination
    static int size(Node root){
        if(root == null)return 0;

        return size(root.left)+size(root.right)+1;
    }

    //Maximum function defination
    static int maximumInTree(Node root){
        if(root == null)return 0;

        return Math.max(root.data,Math.max(maximumInTree(root.left),maximumInTree(root.right)));
    }

    //left view of the tree
    public static void rightSideView(Node root){
        List<Integer> result = new ArrayList<>();

        rightView(root,result,0);
        
    }
    

    public static void rightView(Node curr,List<Integer> result,int currDepth){
        if(curr == null)return ;

        if(currDepth == result.size()){
            result.add(curr.data);
        }
        rightView(curr.right, result, currDepth+1);
        rightView(curr.left, result, currDepth+1);
    }
    
}
