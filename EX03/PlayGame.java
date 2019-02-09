public class PlayGame
{
    public static void main(String args[])
    {
        Game g = new Game(30);

        g.walk(10);//p1
        g.walk(3);//p2
        g.walk(12);//p1
        g.walk(2);//p2
        g.walk(8);//p1 win
    }
}