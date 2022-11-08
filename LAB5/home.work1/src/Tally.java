public class Tally
{
    public static void main(String[] args)
    {
       Counter c=new Counter();

       c.click();
       c.click();
       c.click();
       c.display();
      
       c.undo();
       c.display();

       c.undo();
       c.display();


    }
}
