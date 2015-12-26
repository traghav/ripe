public class Link{
	public int data;
	public Link next;
	public Link()
	{
		next=null;
		data=-1;
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
}