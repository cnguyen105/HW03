package mypack;
import java.util.*;
import java.io.*;

public class CheapScrape2SCV
{

    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO Auto-generated method stub
        for(int i = 0; i < args.length; i++) 
        {
            System.out.println(args[i]);
        }
        
        // Process the command line args kinda like this:
        
        try {
			int columns = Integer.parseInt(args[0]);
			String inputFile = args[1];
			String outputFile = args[2];
			
      
			Scanner in = new Scanner(new File(inputFile));
			PrintWriter out = new PrintWriter(outputFile);
			while(in.hasNextLine())
			{
			    for(int i = 0; i < columns; i++)
			    {
			        String hold = in.nextLine().trim();
			        if(i == 1)
			        {
			            out.print("\"" + hold + "\",");
			        }
			        else if(i == (columns - 1))
			        {
			        	out.print(hold);
			        }
			        else 
			        {
			            out.print(hold + ",");
			        }
			    }
			    out.println("");
			    
			}
			in.close();
			out.close();
		} 
        catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Not a valid number argument");
		}
        catch (ArrayIndexOutOfBoundsException e)
        {
        	e.printStackTrace();
        	System.err.println("Index does not fit in argument array");
        }
        
        

    }

}
