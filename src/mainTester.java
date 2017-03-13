

public class mainTester {
	
	static String seperator = "======================================";
	
	public static void main(String[] args){
		
		StackLinkedList linkedStack = new StackLinkedList();
		
		System.out.println("Testing Stack - Linked List implementation");
		System.out.println(seperator);
		System.out.println("Pushing Strings \"testOne\", \"testTwo\", \"testThree\", \"testFour\"");
		linkedStack.push("testOne");
		linkedStack.push("testTwo");
		linkedStack.push("testThree");
		linkedStack.push("testFour");
		System.out.println(seperator);
		System.out.println("Peeking");
		System.out.println(linkedStack.peek());
		System.out.println(seperator);
		System.out.println("Size = "+linkedStack.size());
		System.out.println(seperator);
		System.out.println("Popping twice");
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(seperator);
		System.out.println("Using for loop and size getter to iterize the\nlast two elements and pop them");
		System.out.println(linkedStack.size());
		for(int i = 0; i<=linkedStack.size();i++){
			System.out.println(linkedStack.pop());
		}
		System.out.println(seperator);
		System.out.println("Pushing testFive peeking, then popping for good measure.");
		linkedStack.push("testFive");
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		System.out.println(seperator);
	
		
		
	}
}
