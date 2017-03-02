package practice;

import java.util.*;

public class DSLinkedList{
	
	
	public static void main(String[] args){
	    DSNode head = new DSNode(0,null);
		DSNode tail = new DSNode(0,null);
		DSNode first = new DSNode(5,null);
		DSNode second = new DSNode(6,null);
		
		head.next = first;
		first.next = second;
		second.next = tail;
		
		System.out.println(first.getValue());
		System.out.println(first.next.getValue());
		System.out.println(second.next.getValue());
	}
	
	
}