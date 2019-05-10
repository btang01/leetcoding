package leetcoding;

import java.util.ArrayList;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class BinaryTree {
	
	public static void main (String[] args){
		BinaryTree bt = new BinaryTree();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(9);
		System.out.println(bt);
	}

	public class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	Node root;
	
	public void add(int value){
		root = addRecursively(root, value);
	}
	
	// add recursive method to insert Nodes
	private Node addRecursively(Node current, int value){
		if(current == null){
			return new Node(value);
		}
		
		if(value < current.value){
			current.left = addRecursively(current.left, value);
		} else if (value > current.value){
			current.right = addRecursively(current.right, value);
		} else {
			return current;
		}
		
		return current;
	}
	
	// find Node in tree
	private boolean doesNodeExist(Node current, int value){
		
		if(current == null){
			return false;
		}
		
		if(value == current.value){
			return true;
		}
		
		boolean res1 = doesNodeExist(current.left, value);
		boolean res2 = doesNodeExist(current.right, value);
		
		return res1 || res2;
	}
	
	// root, then left tree, then right
	// this is cool, popping stacks
	public ArrayList<Integer> preorderTraversal(Node root){
		ArrayList<Integer> result = null;
		Stack<Node> myStack = new Stack<>();
		
		if(root == null){
			return result;
		}
		
		myStack.push(root);
		
		while(!myStack.empty()){
			Node myNode = myStack.pop();
			result.add(myNode.value);
			
			if(myNode.right != null){
				myStack.push(myNode.right);
			}
			
			if(myNode.left != null){
				myStack.push(myNode.left);
			}
		}
		return result;
	}
}
