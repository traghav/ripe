public class QuickSort
{
	public int partition(int []a,int m,int n)
	{	System.out.println("Called");
		int i,j=m,temp;
		for(i=m;i<n;i++)
		{
			if(a[i]<a[n])
			{	temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
				System.out.println("Swapped "+a[i]+" and "+a[j]);

			}
		}
		j++;
		temp=a[n];
		a[n]=a[j];
		a[j]=temp;
		return j;
	}
	public void sort(int []a, int p,int q)
	{
		int pivot=partition(a,p,q);
		sort(a,p,pivot-1);
		sort(a,pivot+1,q);
	}
	public static void main(String args[])
	{	QuickSort qs=new QuickSort();
		int []a={6,5,4,3,2,1,16};
		int n=a.length-1,i;
		System.out.println("----Array Before Sorting------");
		for(i=0;i<=n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n\n\n\n\n");
		qs.sort(a,0,n);
		System.out.println("----Array After Sorting------");
		for(i=0;i<=n;i++)
		{
			System.out.print(a[i]+"\t");
		}

	}
}