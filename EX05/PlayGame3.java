public class PlayGame3
{
    public static void main(String args[])
    {
        Game g = new Game(30);
        g.addTunnel(27,3);
        g.addTunnel(12,3);
        g.addTunnel(7,9);
        g.addTunnel(3,6);
        g.addTunnel(10,8);
        g.addTunnel(25,10);
        g.addTunnel(18,7);
        g.addTunnel(9,11);
        g.addTunnel(22,17);

        while(!g.isEnded()) //check game
        {
            g.play();
        }
    }
}