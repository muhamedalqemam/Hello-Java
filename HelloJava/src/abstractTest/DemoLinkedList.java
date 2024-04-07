package abstractTest;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<String> LinkedLst = new LinkedList<String>();
		LinkedLst.add("item 1");
		LinkedLst.add("item 2");		
		LinkedLst.add("item 3");
		LinkedLst.add("item 4");
		LinkedLst.add("item 5");
		System.out.println("Linked List Contents : " + LinkedLst);


		LinkedLst.addFirst("First item");
		LinkedLst.addLast("Last item");
		System.out.println("Linked list After adding new items at first and last : " + LinkedLst);
		
		
		Object FirstVar = LinkedLst.get(0);
		System.out.println("First of list is : " + FirstVar);
		
		LinkedLst.set(0, "Updated First Item");
		Object SecVar = LinkedLst.get(0);
		System.out.println("The first of list after updating is : " + SecVar);
		System.out.println("Linked list After updating first item : " + LinkedLst);

		
		LinkedLst.removeFirst();
		LinkedLst.removeLast();
		System.out.println("Linked list After removing items at first and last : " + LinkedLst);
		
		
		LinkedLst.add(2,"Forgetten Item");
		LinkedLst.remove(3);
		System.out.println("Final LinkedList : " + LinkedLst);
		
		

	}

}