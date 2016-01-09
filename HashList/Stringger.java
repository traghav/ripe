/*
Given a string which only contains lowercase. 
You need delete the repeated letters only leave one, and try to make the 
lexicographical order of new string is smallest. 
i.e: bcabc 
You need delete 1 'b' and 1 'c', so you delete the first 'b' and first 'c', 
the new string will be abc which is smallest. 
*/
import java.util.*;
public class Stringger
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stringger ss=new Stringger();
		ss.reducer(s);
	}
	public void reducer(String s)
	{
		
		int l=s.length(),i,pow=10;
		int[]a=new int[l];
		char ch;
		boolean[]occured=new boolean[26];
		for(i=l-1;i>=0;i--)
		{	ch=s.charAt(i);
			if(occured[ch-97]==false)
			{
				a[i]=ch-97;
				occured[ch-97]=true;
			}
			else
			{
				a[i]=ch+0;
			}


		}
		System.out.println();
		for(i=0;i<l;i++)
		{
			if(a[i]<27)
			{	
				System.out.print((char)(a[i]+97)) ;
			}
		}

	}	
}