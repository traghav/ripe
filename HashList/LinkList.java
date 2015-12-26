import java.util.*;
public class LinkList
{	
	Link head;
	public LinkList()
	{
		head=null;
	}
	public static void main(String args[])
	{	LinkList ll=new LinkList();
		int i;

		for(i=0;i<10;i++)
		{	int n=(int)(Math.random()*100);
			ll.insert(n);
			System.out.println(n+"\tR Gennnn");



		}
		ll.display();

		

	}
	public void display()
	{
		Link l=head;
		while(l!=null)
		{
			System.out.println(l.getData()+"\t Address="+l.getNext());
			l=l.getNext();
		}
	}
	public void sortedInsert(int n)
	{	
		
		Link l=new Link();
		l.setData(n);
		if(head==null)
		{
			head=l;
		}
		else
		{	Link temp=head;
			while(temp.getData()<=n&&temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			if(temp.getNext()==null)
			{
				temp.setNext(l);
				l.setNext(null);
			}
			else
			{
				temp.setNext(l);
				l.setNext(temp.getNext());			
			}



		}

	}
	
	public void insert(int n)
	{	
		Link l=new Link();
		l.setData(n);
		if(head==null)
		{
			head=l;
		}
		else
		{	Link temp=head;
			while(temp.getNext()!=null)
			{	
				temp=temp.getNext();
			}
			temp.setNext(l);
			l.setNext(null);


		}


	}
}