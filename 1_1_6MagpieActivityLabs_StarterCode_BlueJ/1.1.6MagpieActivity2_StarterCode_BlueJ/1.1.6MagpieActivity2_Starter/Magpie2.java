/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
     /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
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
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
            findKeyword(statement,"dog",0);
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr.") >= 0)
        {
            findKeyword(statement,"Mr.",0);
            response = "He sounds like a good teacher.";
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
                || statement.indexOf("baseball") >= 0
                || statement.indexOf("soccer") >= 0
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

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Please stop.";
        }
        else if (whichResponse == 5)
        {
            response = "Oh, come on.";
        }
        
       

        return response;
    }
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        System.out.println("phrase = " + phrase);
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        //System.out.println("1 . psn = " + psn);
        while (psn >= 0)
        {
            //System.out.println("psn = " + psn);
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            //System.out.println("before = " + before);
            //System.out.println(psn + goal.length() < phrase.length());
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            //System.out.println("psn = " + psn+", after = "+after+", before = "+before);

            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }
            
            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }


}