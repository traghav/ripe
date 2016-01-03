import java.util.*;
public class Hashtest
{	public static int k;
	public static void main(String[]args)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter table size. Preferably Prime");
		k=sc.nextInt();
		Htable hashish=new Htable(k);
		while(true)
		{
			System.out.println("1 for insert\n2 for lookup\n3 For deletion");
			int choice=sc.nextInt();
			if(choice==1)
			{
				int n=sc.nextInt();
				hashish.insert(n,n%k);
			}
			if(choice==2)
			{
				int n=sc.nextInt();
				System.out.println(hashish.lookup(n,n%k));
			}
			if(choice==3)
			{
				int n=sc.nextInt();
				hashish.delete(n,n%k);
			}

		}
	}

}