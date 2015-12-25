import java.io.*;
import java.util.*;

public class Bouncy
{
	public double prob;
	public double desiredProb;
	public long n;
	public Bouncy()
	{	n=0;
		prob=0.0;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Bouncy bouncy=new Bouncy();
		//desiredProb=sc.nextDouble()/sc.nextDouble();
		//System.out.println(findnumber());
		long i=1;
		
		float proba=0;
		while((proba/i)<=.9)
		{

			if(bouncy.isBouncy(i)==false)
				proba++;
			i++;
			System.out.println(i+ "\t"+(proba/i));
		}

		
			
			
		
		
	}
	public boolean isBouncy(long num)
	{	boolean min=false,max=false;
		double last=num%10,next;
		num/=10;
		while(num!=0){
			next=num%10;
			if(next>last)
				max=true;
			if(next<last)
				min=true;
			num/=10;
			last=next;
		}
		return !(min&&max);

	}
}