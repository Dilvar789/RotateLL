public class RotateLL 
{
	static Node head;
	
	public static class Node
	{
	int data;
	Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public RotateLL insert(RotateLL li,int data) 
	{
		Node newNode=new Node(data);
		newNode.next=null;
		
		if(head == null)
		{
			head=newNode;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public  void display(RotateLL li)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	 static void rotate(int n) 
	    { 
	        Node current  = head; 
	        int count = 1; 
	        while (current !=  null && count < n) 
	        { 
	            current = current.next; 
	            count++; 
	        } 
	        Node temp = current; 
	        while (current.next != null)
	        {
	            current = current.next; 
	        }
	        current.next = head; 
	        head = temp.next; 
	        temp.next = null; 
	    } 
	public static void main(String[] args)
	{
		RotateLL li=new RotateLL();
		   li.insert(li, 10);
		   li.insert(li, 20);
		   li.insert(li, 30);
		   li.insert(li, 40);
		    rotate(2);
		   li.display(li);
	}
}
