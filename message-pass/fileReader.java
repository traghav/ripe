import java.io.*;
import java.util.*;
public class fileReader
{	public static void main(String args[])throws IOException{
	//File file = new File("feedme.txt");

      try {
            Scanner input = new Scanner(System.in);
            
            File file = new File("Pass_the_message-test-input.txt");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextInt()+"";
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
}
}