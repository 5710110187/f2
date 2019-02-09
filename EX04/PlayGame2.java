public class PlayGame2
{
    public static void main(String args[])
    {
        Game g = new Game(30);

        while(!g.isEnded()) //checking
        {
            g.play();
        }
    }
}