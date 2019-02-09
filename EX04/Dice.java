public class Dice
{
    private int sumPoint;

    public Dice()
    {
        sumPoint = 1;
    }

    public void roll()
    {
        sumPoint = (int)(Math.random()*6)+1; //dice's point
    }
    public int getPoint()
    {
        return sumPoint;
    }
}