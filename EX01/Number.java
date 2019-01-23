public class Number
{
    public static void main(String args[])
    {
        Calculate c = new Calculate(); // initial constructors
        int count = 0;
        int i,show;
        
        while(count<5)
        {
            for(i=0 ; i<10 ; i++ ){
                show = c.Inc();
                System.out.println(show);
            }
            count++;
            c.reset();
        }
        

    }
}
