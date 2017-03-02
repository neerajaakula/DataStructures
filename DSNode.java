package practice;

public class DSNode{
	private int value;
	public DSNode next;
	
	public DSNode(int n, DSNode node){
		value = n;
		next = node;
	}
	
	public void setValue(int a){
		value = a;
	}
	
	public int getValue(){
		return value;
	}
	
}