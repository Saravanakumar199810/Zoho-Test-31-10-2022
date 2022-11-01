package zohoTest2;


public class LinkedList {
	Node head;
	Node pos;
	class Node{
		int data;
		Node next;
		Node(int num){
			data=num;
			next=null;
		}
	}

	private void push(int n) {
		Node node = new Node(n);
		if(pos!=null) {
			pos.next=node;
		}
		if(head==null) {
			head=node;
		}
		pos=node;
	}
	
	private void rightMax() {
		Node n1= head;
		int count;
		while(n1!=null) {
			Node n2= n1.next;
            count=0;
			while(n2!=null) {
				if(n1.data<n2.data) {
					count++;
					System.out.print(n2.data);
					break;
				}
				n2=n2.next;
			}
			if(count==0)
				System.out.print(count);
			n1=n1.next;
		}
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(2);
		llist.push(7);
		llist.push(4);
		llist.push(3);
		llist.push(5);
		llist.rightMax();
	}

}
