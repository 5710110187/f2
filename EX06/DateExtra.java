import java.util.Scanner;

public class DateExtra
{
    public static void main(String[] args) 
    {
        System.out.println("Enter date ddmmmyyyy");
        Scanner s = new Scanner(System.in);
        String date;
        date = s.next();
        int d,y;
        String m;
        d = Integer.parseInt(date.substring(0,2));//dd
        m = date.substring(2,5);
        y = Integer.parseInt(date.substring(5,9));
        System.out.println("dd : "+d);
        System.out.println("mmm : "+m);
        System.out.println("yyyy : "+y);

        s.close();



    }
    
}