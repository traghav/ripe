import java.io.*;
import java.util.*;
public class messagePass
{


	public int[][]a=new int[100][100];
	public void resetArray(){
		int i,j;
		for(i=0;i<100;i++){
			for(j=0;j<100;j++){
				a[i][j]=0;
			}
		}
	}




	public static void main(String args[])throws IOException{
		messagePass mp=new messagePass();
	

      try {
            Scanner input = new Scanner(System.in);
            
            File file = new File("Pass_the_message-test-input.txt");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                int t= input.nextInt();
                while(t!=0){
                	t--;
                	mp.resetArray();
                	
                }
            
















            }


            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }