import java.util.ArrayList;

public class Auction
{
    private ArrayList<Lot> lots;

    public Auction()
    {
        lots = new ArrayList<Lot>();
    }

    public void enterLot(int lotNum, String description)
    {
        lots.add(new Lot(lotNum, description));
    }

    public void showLots()
    {
        for(Lot lot : lots)
        {
            System.out.println(lot.toString());
        }
    }

    public Lot getLot(int lotNum)
    {
        for(Lot lot : lots)
        {
            if(lot.getIdNum() == lotNum)
            {
                return lot;
            }
        }

        System.out.println("Lot number : " + lotNum + " does not exist.");
        return null; //no obj
    }

    public void bidFor(int lotNum, String name, int bid) //ใส่ข้อมูล
    {
        for(Lot lot : lots)
        {
          //  if(lotNum == l)
            //{
            lot.bidFor(lotNum,name,bid);
            //}
            
        }
    }

}