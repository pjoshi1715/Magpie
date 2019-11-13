/**
 * Write a description of class ThoreauRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ThoreauRunner
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ThoreauRunner
     */
    public ThoreauRunner()
    {
        Thoreau thoreau = new Thoreau();
		
	thoreau.initialprint();
	Scanner in = new Scanner (System.in);
	String statement = in.nextLine();
	
	while (!statement.equals("Bye"))
	{
	    System.out.println (thoreau.printadvice(statement));
	    statement = in.nextLine();
	}
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}


        
