public class Adder
{
    private double result;

    public Adder ()
    {
        result = 0.0;
    }

    public void sum (double num)
    {
        result += num;
    }

    public void addForm(Adder another){
        result += another.getValue();
    }

    public void reset ()
    {
        result = 0.0;
    }

    public double getValue ()
    {
        return result;
    }

    
}