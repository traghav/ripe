public class PascalGen
{
	public void gen(int k)
	{
		int [][]a=new int [k][k];
		
		int i,j;
		for(i=0;i<k;i++)
		{	a[i][0]=1;
			for(j=1;j<i;j++)
			{
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			//a[i][++j]=1;
		}
		for(i=0;i<k;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	public static void main(String args[])
	{
		PascalGen pg=new PascalGen();
		//pg.gen(10);
		pg.prettyPattern(10);
	}
	public void prettyPattern(int n)
	{
	    int[][]a=new int[(2*n)-1][(2*n)-1];
	    int i,j,k,end=(2*n)-2,start=0;
	    k=n;
	    while(k!=0)
	    {
    	    for(i=start;i<=end;i++)
    	    {
    	        a[start][i]=k;
    	        a[i][start]=k;
    	        a[end][i]=k;
    	        a[i][end]=k;
    	    }
    	    k--;
    	    start++;
    	    end--;
	    }
	    for(i=0;i<(2*n)-1;i++)
		{
			for(j=0;j<(2*n)-1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}