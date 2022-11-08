public class Main
{
    public static void main(String[] args)
    {
        h3 l=new h3();
        l.deposit(7000);

        System.out.println(l.getNumber());
       l.withdrawr(600);

        System.out.println(l.getNumber());
        l.withdrawr(4000);
        System.out.println(l.getNumber());
    }
}
