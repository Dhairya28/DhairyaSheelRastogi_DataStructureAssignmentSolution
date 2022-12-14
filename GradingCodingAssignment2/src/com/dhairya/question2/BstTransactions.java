package com.dhairya.question2;

public class BstTransactions {
	

        static class Node{
            int val;
            Node left, right;

            Node(int item)
            {
                val = item;
                left = right = null;
            }
        }

        public static Node node;
        static Node prevNode = null;
        static Node headNode = null;


       public static void flattenBstToSkewed(Node root,int order){
        	
            if(root == null)
            {
                return;
            }

            if(order > 0)
            {
                flattenBstToSkewed(root.right, order);
            }
            else
            {
                flattenBstToSkewed(root.left, order);
            }
            Node rightNode = root.right;
            Node leftNode = root.left;

            if(headNode == null)
            {
                headNode = root;
                root.left = null;
                prevNode = root;
            }
            else
            {
                prevNode.right = root;
                root.left = null;
                prevNode = root;
            }

            if (order > 0)
            {
                flattenBstToSkewed(leftNode, order);
            }
            else
            {
                flattenBstToSkewed(rightNode, order);
            }
        }

        public static void traverseRightSkewed(Node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.print(root.val + " ");
            traverseRightSkewed(root.right);
        }


        public static void main (String[] args){

            BstTransactions tree = new BstTransactions();
            tree.node = new Node(50);
            tree.node.left = new Node(30);
            tree.node.right = new Node(60);
            tree.node.left.left = new Node(10);
            tree.node.right.left = new Node(55);

            int order = 0;
            flattenBstToSkewed(node, order);
            traverseRightSkewed(headNode);
        }

}
