import java.util.*; 

public class CupGame
{
    public void StartGame()
    {
        while(true)
        {
            List<Cup> cups = new ArrayList<Cup>();
            Random rand = new Random();
            
            for (int i = 0; i < 15; i++)
            {
                cups.add(new Cup());
            }
            
            cups.get(rand.nextInt(15)).AddBall();
            
            AskUser(cups);
        }
    }
    
    private void AskUser(List<Cup> cups)
    {
        boolean guessCorrect = false;
        Scanner input = new Scanner(System.in);
        int guess = 0;
        
        System.out.print("Pick a cup between 1 and 15: ");
        
        while(guessCorrect == false)
        {
            guess = input.nextInt();
            if(guess >= 1 && guess <= 15)
            {
                if (cups.get(guess-1).HasBall())
                {
                    guessCorrect = true;
                    System.out.print("Congratulation, you found it!");
                }
                else
                {
                    System.out.print("Miss! Try again, pick a cup between 1 and 15: ");
                }
            }
            else
            {
                System.out.print("Not between 1 and 15, try again: ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
