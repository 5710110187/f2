public class Game
{
    private int win;
    private int state;
    private int play1;
    private int play2;

    public Game(int finish)
    {
        win = finish;
        state = 1; //play1 start
        play1 = 0;
        play2 = 0;
        
    }

    public void walk(int num)
    {
        switch(state)
        {
            case 1 :
                play1 = play1+num;
                state =2;
                break;
            case 2:
                play2 = play2+num;
                state = 1;
                break;
        }
        if( play1 >= win )
        {
            System.out.println("PLAYER1 IS WINNER!!!!!");
        }
        else if(play2 >= win)
        { 
            System.out.println("PLAYER2 IS WINNER!!!!!");
        }

    }

}