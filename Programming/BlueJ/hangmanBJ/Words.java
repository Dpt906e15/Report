import java.util.*;
import java.lang.*;

public class Words
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private String[] words = 
    {
        "METAMORPHICALLY",
        "PHARMACEUTICALS",
        "STRAIGHTJACKETS",
        "VULNERABILITIES",
        "TRANSPORTATIONS",
        "NONPROFESSIONAL",
        "MISCALCULATIONS",
        "MICROSCOPICALLY",
        "IMMORTALISATION",
        "HYPERACTIVITIES",
        "HETEROSEXUALITY",
        "DISSATISFACTION"
    };
    
    private String finalWord;
    
    ArrayList<String> guessedLetters;
    
    private String wrongLetters;

    /**
     * Konstruktør for objekter af klassen Words
     */
    public Words()
    {
        finalWord = words[(int)(Math.random() * 12)];
        guessedLetters = new ArrayList<String>();
        wrongLetters = "";
        
        for(int i = 0; i < 15; i++)
        {
            guessedLetters.add(" _ ");
        }
    }
    
    public boolean Guess(String guess)
    {
        if(guessedLetters.contains(guess) || wrongLetters.contains(guess))
        {
            System.out.println("The letter has already been tried out!");
            return true;
        }
        
        boolean isPresent = false;
        for(int i = 0; i < finalWord.length(); i++)
        {
            if(guess.equals(String.valueOf(finalWord.charAt(i))))
            {
                System.out.println("The letter is in place nr " + Integer.toString(i));
                SetGuessed(guess, i);
                isPresent = true;
            }
        }
        if(isPresent == false)
        {
            System.out.println("The letter is not present in the word");
            SetWrong(guess);
        }
        
        return isPresent;
    }
    
    public ArrayList<String> GetGuessed()
    {
        return guessedLetters;
    }
    
    public String GetWrong()
    {
        return wrongLetters;
    }
    
    private void SetGuessed(String g, int i)
    {
        guessedLetters.set(i, g);
    }
    
    private void SetWrong(String g)
    {
        wrongLetters += g;
    }
    
    public String GetGuessedString()
    {
        String x = "";
        for(String i : guessedLetters)
        {
            x += i;
        }
        
        return x;
    }
}
