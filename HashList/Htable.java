public class Htable
{
	public class Link
	{
		public int data;
		public int key;
		public Link next;
		public Link()
		{
			next=null;
			data=0;
		}
		public int getData()
		{
			return data;
		}
		public void setData(int d)
		{
			data=d;
		}
		public Link getNext()
		{
			return next;
		}
		public void setNext(Link l)
		{
			next=l;
		}
		public int getKey()
		{
			return key;
		}
		public void setKey(int k)
		{
			key=k;
		}
	}
	public Htable.Link[] hashme;
	public int keysize;
	public Htable(int k)
	{	keysize=k;
		hashme=new Htable.Link[k];
	}
	public void insert(int n, int k)
	{

		Htable.Link l=new Link();
		l.setData(n);
		if(hashme[k]==null)
		{
			hashme[k]=l;
		}
		else
		{	Htable.Link temp=hashme[k];
			while(temp.getNext()!=null)
			{	
				temp=temp.getNext();
			}
			temp.setNext(l);
			l.setNext(null);


		}


	
	}
	public boolean lookup(int n, int k)
	{	Htable.Link l=hashme[k];
		if(l.getData()==n)
			return true;
		else
		{
			while(l.getNext()!=null)
			{	if(l.getData()==n)
					return true;
				else
					l=l.getNext();

			}
		}
		return false;
	}
	public void delete(int n,int k)
	{
		if(lookup(n,k)==false)
			System.out.println("What do I delete bro? Can't find it in the first place.");
		else
		{	Htable.Link l=hashme[k];
			if(l.getData()==n)
				hashme[k]=l.getNext();
		else
		{	Htable.Link prev=hashme[k];
			while(l.getData()!=n)
			{	if(l.getNext()==null)
				{
					System.out.println("couldn't find");
					break;
				}
					
				else
				{	prev=l;
					l=l.getNext();

				}

			}
			prev.setNext(l.getNext());
			System.out.println("Deleted");
		}

	}
















	}
}