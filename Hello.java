import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Hello
{
	public static void main(String[]args)
	{
		String filename = "input.txt";
		try{
			
			BufferedReader in = new BufferedReader(new FileReader(filename));  
	        String inputFileStr;
			int count = 0;
			while ((inputFileStr = in.readLine()) != null)
			{
				System.out.println("Hello I am "+inputFileStr);
				count++;
			}
			System.out.println("Total: "+count);
			in.close();
		}
		catch (IOException e) {
	        System.out.println("File read error for (" + filename + ")! ");
	        e.printStackTrace();
	    }
	}
}