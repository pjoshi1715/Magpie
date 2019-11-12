
/**
 * Write a description of class Thoreau here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thoreau
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Thoreau
     */
    public String initialprint()
    {
        return "Greetings fellow citizens.";
    }
    
    
    public String printadvice(String statement)
    {
        String response = "";
        String check = statement.trim();
        if (check.length() == 0){
            response = "Say something please.";
        }
        else if (statement.indexOf("yes") >= 0)
        {
            response = "Why so positive?";
        }
        else if (statement.indexOf("Trump") >= 0
                || statement.indexOf("politics") >= 0
                || statement.indexOf("government") >= 0
                || statement.indexOf("democracy") >= 0)
        {
            response = "If the machine of government is of such a nature that it requires you to be the agent of injustice to another, then, I say, break the law.";
        }
        else if (statement.indexOf("friend") >= 0)
        
        {
            response = "The language of friendship is not words but meanings.";
        }
        else if (statement.indexOf("old") >= 0)
        {
            response = "I am 44 years young.";
        }
        else if (statement.indexOf("Ms.") >= 0
        || statement.indexOf("Mrs.") >= 0)
        {
            response = "She sounds like a good teacher.";
        }
        else if (statement.indexOf("school") >= 0
        || statement.indexOf("class") >= 0)
        {
            response = "That's a cool school. I go to Patriot Bible University.";
        }
        else if (statement.indexOf("basketball") >= 0
        || statement.indexOf("baseball") >= 0)
        || statement.indexOf("soccer") >= 0)
        || statement.indexOf("football") >= 0)
        {
            response = "My athletic ability is nonexistent.";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "No you!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }  

    private void Continue()
    {
        final int NUMBER_OF_RESPONSES = 3;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Not until we are lost do we begin to understand ourselves.";
        }
        else if (whichResponse == 1)
        {
            response = "To be awake is to be alive.";
        }
        else if (whichResponse == 2)
        {
            response = "Start by making the most of what you have. ";
        }
        return response;
    }






    private void wordtostatement()
    {
        String response = "";
        String check = statement.trim();
        if (check.length() == 0){
            response = "Sometimes saying less can be more.";
        }
        else if (statement.indexOf("yes") >= 0)
        {
            response = "Don’t just agree, forge your own path. You must be the key to your own success. ";
        }
        else if (statement.indexOf("money") >= 0)
        {
            response = "Are you sure you need these materialistic things to sustain your lifestyle?";
        }
        else if (statement.indexOf("life") >= 0)
        
        {
            response = "But what does life mean to you?";
        }
        else if (statement.indexOf("stupid") >= 0)
        {
            response = "How are you doing in school?";
        }
        else if (statement.indexOf("pond") >= 0)
       
        {
            response = "The pond represented a stream of time. How do you spend your time?";
        }
               return response;
    }    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
