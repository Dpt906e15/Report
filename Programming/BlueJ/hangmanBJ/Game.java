import java.util.*;

public class Game
{
    
    static Scanner key = new Scanner(System.in);
    
    public Words words;
    public HangMan hangman;
    
    public static void main(String[] args)
    {
        
        System.out.println("Welcome to hangman!");
        
        Game game = new Game();
        
        game.TheGame();
        
        
    }
    
    public Game()
    {
        words = new Words();
        hangman = new HangMan();
    }
    
    public void TheGame()
    {
        boolean isDone = false;
        boolean isCorrect = false;
        
        while(!isDone)
        {
            System.out.println("Guess a letter:");
            String guess = key.nextLine();
            if(guess.length() > 1)
            {
                System.out.println("Please write only a single letter!");
            }
            else
            {
                isCorrect = words.Guess(guess);
            }
            
            if(!isCorrect)
            {
                hangman.LoseLife();
                System.out.println("You now have " + Integer.toString(hangman.GetLives()) + " left");                
            }
            
            if(!words.GetGuessed().contains(" _ "))
            {
                 System.out.println("You Win! The word was " + words.GetGuessedString());
                 isDone = true;
                 break;
            }
            else if(hangman.GetLives() <= 0)
            {
                System.out.println("You Lose!");
                isDone = true;
                break;
            }
            
             System.out.println("Word so far: " + words.GetGuessedString()); 
             System.out.println("Wrong words: " + words.GetWrong());
        }
        
    }
}
