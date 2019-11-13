import java.util.Scanner;
/**
 * Write a description of class Thoreau here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thoreau
{
     public void initialprint()
     {
        System.out.println("Greetings fellow citizens. What is your name");
        evaluatename();
    }
    public void evaluatename(){
        Scanner in = new Scanner (System.in);
	String UI = in.nextLine();
        System.out.println("That is a very cool name. What do you want advice on?");
    }
    public String printadvice(String statement)
    {
        String response = "";
        String check = statement.trim();
        if (check.length() == 0){
            response = "Say something please.";
        }
        else if (statement.indexOf("name") >= 0)
        {
            response = "Henry David Thoreau";
        }
        else if (statement.indexOf("hello") >= 0)
        {
            response = "Hello!";
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
        else if (statement.indexOf("confused") >= 0)
        
        {
            response = "Not until we are lost do we begin to understand ourselves.";
        }
        else if (statement.indexOf("from") >= 0)
        
        {
            response = "I am a child of America.";
        }
        
        else if (statement.indexOf("do") >= 0)
        {
            response = "Think. Reflect. Act on your thoughts?";
        }
        else if (check.length() == 0){
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
        else {
         return Continue();
        }
        return response;
    }    
    public String wordtostatement(String statement)
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
        else {
         return Continue();
        }
               return response;
    }    

    private String Continue()
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
}
