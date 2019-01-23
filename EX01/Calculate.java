public class Calculate
{
    private int number;

    public Calculate(){
        number = 0;
    }

    public int Inc(){
        number++;
        return number;
    }

    public int reset(){
        number = 0;
        return number;
    }
}