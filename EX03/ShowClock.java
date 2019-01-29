public class ShowClock
{
    public static void main(String args[])
    {
        Clock c = new Clock(12, 35);

        c.pressCenter(true);
        c.up();
        c.up();
        c.pressCenter(false);
        c.up();
        c.up();
        c.up();
        c.up();
        c.up();
        c.pressCenter(true);
        c.printTime(); //14:40
    }
}