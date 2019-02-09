public class Game
{
    private int win;
    private int state;
    private int play1;
    private int play2;
    private Dice dice1;
    private Dice dice2;

    public Game(int finish)
    {
        win = finish;
        state = 1; //play1 start
        play1 = 0;
        play2 = 0;
        dice1 = new Dice(); //create obj
        dice2 = new Dice(); //create obj
        
    }

    public boolean isEnded()
    {
        return play1 >= win || play2 >= win;
    }

    public void play()
    {
        dice1.roll();
        dice2.roll();
        walk(dice1.getPoint()+dice2.getPoint());
    }

    public void walk(int num)
    {
        switch(state)
        {
            case 1 :
                System.out.print("p1 roll "+num+ " walk from " + play1);
                play1 = play1+num;
                System.out.println(" to " + play1);
                state =2;
                break;
            case 2:
                System.out.print("p2 roll "+num+ " walk from " + play2);
                play2 = play2+num;
                System.out.println(" to " + play2);
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