public class ShowNum
{
    public static void main (String args[]){

        Adder a = new Adder();
        a.sum(2);
        a.sum(3);
        System.out.println("a = " + a.getValue());//5
        a.sum(3);
        System.out.println("a = " + a.getValue());//8

        Adder b = new Adder();
        b.sum(7.2);
        b.sum(9.9);
        b.sum(2.7);
        System.out.println("b = " + b.getValue());//19.8

        a.addForm(b);
        System.out.println("a = " + a.getValue());
        a.reset();
        System.out.println("a = " + a.getValue());

        Adder c = new Adder();
        c.sum(18.7);
        a.addForm(c);
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
        System.out.println("c = " + c.getValue());
    }
}