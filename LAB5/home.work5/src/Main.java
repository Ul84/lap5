public class Main
{
    public static void main(String[] args)
    {
        h5 in=new h5();
        in.mastery(500);
    in.deposits(100);
    in.deposits(200);
    in.withdraws(500);

    System.out.println(in.getBalance());
    }
}
