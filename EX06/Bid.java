public class Bid
{
    public int bid;
    public String bidname;
    
    public Bid( String name, int num )
    {
        bid = num;
        bidname = name;
    }

    public String getBidderName( )
    {
        return bidname;
    }

    public int getValue()
    {
        return bid;
    }

}