public class SortedLinkList
{
	public Link head;
	public void insert(int n)
	{
		Link l=new Link();
		l.setData(n);
		if(head==null)
		{
			head=l;
			
		}
		else
		{
			Link temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
				if(temp.getData()>=n)
					break;

			}
			l.setNext(temp.getNext());
			temp.setNext(l);
			//System.out.println("New insert");
			//display();

		}

	}
	public void findme(int n)
	{
		Link l=head;
		while(l.getNext()!=null)
		{	l=l.getNext();
			if(l.getData()==n)
			{
				System.out.println(l+"\t F0und");
			}
		}
	}
	public static void main(String args[])
	{
		int i,n,k=0;
		SortedLinkList sll=new SortedLinkList();
		for(i=0;i<5;i++)
		{	n=(int)(Math.random()*100);
			if(i==3)
				k=i;

			sll.insert(n);
		}
		sll.display();
		
		sll.findme(k);

		
	}
	public void display()
	{
		Link temp=head;
		while(temp.getNext()!=null)
		{
			
			System.out.println(temp.getData()+"\tAddress"+temp.getNext());
			temp=temp.getNext();
		}
	}
}