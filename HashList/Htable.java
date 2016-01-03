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
		{	Link temp=hashme[k];
			while(temp.getNext()!=null)
			{	
				temp=temp.getNext();
			}
			temp.setNext(l);
			l.setNext(null);


		}


	
	}
	public boolean lookup(int n, int k)
	{
		return false;
	}
}