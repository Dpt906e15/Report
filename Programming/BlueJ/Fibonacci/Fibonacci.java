
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
    {
    }

    public int Fibonacci_recursive(int n)
    {
      if (n <= 1) return n;
      else return Fibonacci_recursive(n-1) + Fibonacci_recursive(n-2);
    }
    
    public int Fibonacci_iterative(int n)
    {
      int x = 0; int y = 1; int z = 1;
      for(int i = 0; i < n; i++)
      {
          x = y;
          y = z;
          z = x + y;
      }
      return z- x;
      
    }
}
