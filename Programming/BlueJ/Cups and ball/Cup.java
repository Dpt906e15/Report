public class Cup
{
    private boolean holdsBall = false;

    public void AddBall()
    {
        holdsBall = true;
    }
    
    public boolean HasBall()
    {
        return holdsBall;
    }
}
