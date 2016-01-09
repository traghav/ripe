public class arrayTester
{
	public static void main(String args[])
	{
		int n=8,i;
		int[]a=new int[n];
		for(i=0;i<n;i++)
			a[i]=i+1;
		int j;
		display(a);
		for(i=1;i<=n/2-1;i+=2)
		{
			int t=a[i];
			a[i]=a[i*2];
			a[i*2]=t;
			display(a);

		}
		

	}
	public static void display(int[]a)
	{
		int l=a.length;
		int i;
		for(i=0;i<l;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
}