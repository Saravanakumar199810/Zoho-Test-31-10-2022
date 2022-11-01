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

	public void push(int n) {
		Node node = new Node(n);
		if(pos!=null) {
			pos.next=node;
		}
		if(head==null) {
			head=node;
		}
		pos=node;
	}
	
	public void rightMax() {
		Node n1= head;
		int frontData;
		while(n1!=null) {
			Node n2= n1.next;
			frontData=n1.data;
			while(n2!=null) {
				frontData=Math.max(frontData, n2.data);
				if(frontData>n1.data) {
					break;
				}
				n2=n2.next;
			}
			if(frontData>n1.data) {
				System.out.print(frontData);
			}else {
				System.out.print(0);
			}
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
