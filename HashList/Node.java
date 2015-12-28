public class Node
{
	public int data;
	public Node left;
	public Node right;
	public Node()
	{
		data=0;
		left=null;
		right=null;
	}
	public int getData()
	{
		return data;

	}
	public void setData(int n)
	{
		data=n;
	}
	public Node getLeft()
	{
		return left;
	}
	public void setLeft(Node l)
	{
		left=l;
	}
	public Node getRight()
	{
		return right;
	}
	public void setRight(Node r)
	{
		right=r;
	}
}