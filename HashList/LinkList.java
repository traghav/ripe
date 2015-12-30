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
		ll.insert(0);
		for(i=0;i<3;i++)
		{	int n=(int)(Math.random()*100);
			//ll.sortedInsert(n);
			ll.insert(n);
			System.out.println(n+"\tR Gennnn");



		}
		ll.display();
		//Scanner sc=new Scanner(System.in);
		//int k=sc.nextInt();
		//ll.find(k);
		ll.sort();
		System.out.println("\n\n\n\n");
		ll.display();

		

	}
	public void sort()//straight outta memory
	{
		int temp;
		Link i,j;
		i=head;
		while(i.getNext()!=null)
		{	
			j=i;
			while(j.getNext()!=null)
			{	
				if(j.getData()>j.getNext().getData())
				{
					temp=j.getData();
					j.setData(j.getNext().getData());
					j.getNext().setData(temp);
				}
				j=j.getNext();

			}
			i=i.getNext();
		}

	}
	public void find(int n)
	{
		Link l=head;
		while(l!=null)
		{	if(l.getData()==n)
			{
				System.out.println("Found! at link "+l.getNext());

			}

			l=l.getNext();
			

		}
	}
	public void display()
	{
		Link l=head;
		while(l!=null)
		{
			System.out.println(l.getData()+"\t Address="+l);
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
			while(temp!=null)
			{	if(temp.getData()<=n)
				{
					break;

				}

				temp=temp.getNext();
			

			}
			l.setNext(temp);
			temp.setNext(l);



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