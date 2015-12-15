
/**
 * Lav en beskrivelse af klassen HangMan her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class HangMan
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private int lives;

    /**
     * Konstruktør for objekter af klassen HangMan
     */
    public HangMan()
    {
        // initialiser instansvariable
        lives = 8;
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     * 
     * @param  y  eksempel på en parameter til en metode
     * @return    summen af x og y 
     */
    public void LoseLife()
    {
        // indsæt din egen kode her
        lives--;
        
    }
    
    public int GetLives()
    {
        return lives;
    }
}
